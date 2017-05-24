package test;

import com.pi4j.io.gpio.RaspiPin;
import hardware.converter.PCF8591;
import hardware.led.RgbLedPWM;
import hardware.sensor.Photoresistor;

public class PhotoresistorRgbLedTest {

	public static void main(String[] args) throws Exception {
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		Photoresistor photo = new Photoresistor(pcf8591);
		RgbLedPWM led = new RgbLedPWM(RaspiPin.GPIO_21, RaspiPin.GPIO_02, RaspiPin.GPIO_03);

		while(true){
		double value = photo.getValue();
		if (value <= 20) {
			led.ledColorSet(255, 0, 0);
		} else if (value > 20 && value <= 50) {
			led.ledColorSet(0, 255, 0);
		} else {
			led.ledColorSet(0, 0, 255);
		}
		System.out.println(value);
		}

	}
}
