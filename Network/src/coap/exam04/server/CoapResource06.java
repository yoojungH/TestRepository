package coap.exam04.server;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.sensor.GasSensor;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class CoapResource06 extends CoapResource {

	//Field
	private String text;
	private GasSensor gasSensor;
	private ActiveBuzzer activeBuzzer;
	//Constructor
	public CoapResource06() {
		super("resource06");

		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN2);
		gasSensor = new GasSensor(pcf8591, RaspiPin.GPIO_23);
		activeBuzzer = new ActiveBuzzer(RaspiPin.GPIO_24);
		//관찰 기능 활성화
		setObservable(true);
		//관찰 기능을 제공한다는 것을 클라이언트가 알 수 있도록 설정
		getAttributes().setObservable();
		//테스트
		Thread thread = new Thread() {
			@Override
			public void run() {

				gasSensor.setGpioPinListenerDigital(new GpioPinListenerDigital() {
					@Override
					public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
						if (event.getState() == PinState.LOW) {
							text = "가스검출";
							activeBuzzer.on();
							changed();
						} else {
							text = "정상상태";
							activeBuzzer.off();
							changed();
						}
					}
				});
			}

		};
		thread.start();
	}

	//Method
	@Override
	public void handleGET(CoapExchange exchange) {
		exchange.respond(text);
	}

	@Override
	public void handlePOST(CoapExchange exchange) {

	}

}
