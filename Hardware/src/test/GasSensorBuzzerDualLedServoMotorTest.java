package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.DualColorLed;
import hardware.motor.SG90Servo;
import hardware.sensor.GasSensor;

public class GasSensorBuzzerDualLedServoMotorTest {

	public static void main(String[] args) throws Exception {
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		GasSensor gasSensor = new GasSensor(pcf8591, RaspiPin.GPIO_00);
		SG90Servo servo = new SG90Servo(RaspiPin.GPIO_01, 8, 25);
		ActiveBuzzer buzzer = new ActiveBuzzer(RaspiPin.GPIO_03);
		DualColorLed led = new DualColorLed(RaspiPin.GPIO_21, RaspiPin.GPIO_22);

		led.green();
		//방법 1 : Digital 핀의 상태를 이용
		gasSensor.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if (event.getState() == PinState.LOW) {
					System.out.println("**************위험 : 가스 검출************");
					led.red();
					buzzer.on();
					for (int i = 0; i <= 180; i += 10) {
						servo.setAngle(i);
					}
					

				} else {
					System.out.println("**************정상 상태************");
					led.green();
					buzzer.off();
					servo.setAngle(0);
				}
			}
		});

		//방법 2: Analog값 이용
		while (true) {
			double value = gasSensor.getValue();
			System.out.println(value);
			if (value > 200) {

			}
			Thread.sleep(1000);
		}

	}

}
