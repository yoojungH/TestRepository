package hardware.sensor;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.converter.PCF8591;
//3.3V

public class GasSensor {

	//Field
	private PCF8591 pcf8591;
	private GpioPinDigitalInput gpioPinDigitalInput;

	//Contructor
	public GasSensor(PCF8591 pcf8591, Pin digitalPinNo) {
		this.pcf8591 = pcf8591;
		GpioController gpioController = GpioFactory.getInstance();
		gpioPinDigitalInput = gpioController.provisionDigitalInputPin(digitalPinNo);
		gpioPinDigitalInput.setShutdownOptions(true, PinState.LOW);
	}

	public void setGpioPinListenerDigital(GpioPinListenerDigital listener) {
		gpioPinDigitalInput.addListener(listener);
	}

	//Method
	public double getValue() throws Exception {
		int analogVal = pcf8591.analogRead(); // 0~255
		return analogVal;
	}

public static void main(String[] args) throws Exception {
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN2);
		GasSensor test = new GasSensor(pcf8591, RaspiPin.GPIO_23);
		
		//방법1: Digital 핀의 상태를 이용
		test.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if(event.getState() == PinState.LOW) {
					System.out.println("***************** 가스 검출");
				} else {
					System.out.println("***************** 정상 상태");
				}
			}
		});		
		
		System.in.read();
		//방법2: Analog 값 이용
//		while(true) {
//			double value = test.getValue();
//			System.out.println(value);
//			if(value>200) {
//				//Analog 값을 이용해서 처리
//			}
//			Thread.sleep(1000);
//		}

	}	
}
