package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.DualColorLed;
import hardware.sensor.FlameSensor;

public class FlameSensorBuzzerDualLedTest {
	public static void main(String[] args) throws Exception {
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		FlameSensor flameSensor = new FlameSensor(pcf8591, RaspiPin.GPIO_00);
		DualColorLed dualColorLed = new DualColorLed(RaspiPin.GPIO_21, RaspiPin.GPIO_22);
		ActiveBuzzer activeBuzzer = new ActiveBuzzer(RaspiPin.GPIO_03);
		
		dualColorLed.green();
		
		 //방법 1 : Digital 핀의 상태를 이용
		flameSensor.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if(event.getState() == PinState.LOW){					
					System.out.println("**************위험:화재발생************");
					dualColorLed.red();
					activeBuzzer.on();
				}else {
					System.out.println("**************정상 상태************");
					dualColorLed.green();
					activeBuzzer.off();
				}
			}
		});
		System.in.read();


	}
}
