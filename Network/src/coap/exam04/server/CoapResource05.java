package coap.exam04.server;

import hardware.converter.PCF8591;
import hardware.sensor.ThermistorSensor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class CoapResource05 extends CoapResource {

	//Field
	private int value;
	private double temp;
	private ThermistorSensor thermistorSensor;

	//Constructor
	public CoapResource05() {
		super("resource05");

		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN1);
		thermistorSensor = new ThermistorSensor(pcf8591);

		//관찰 기능 활성화
		setObservable(true);
		//관찰 기능을 제공한다는 것을 클라이언트가 알 수 있도록 설정
		getAttributes().setObservable();
		//테스트
		Thread thread = new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						temp = thermistorSensor.getValue();
					} catch (Exception ex) {
					}
					changed();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		thread.start();
	}

	//Method
	@Override
	public void handleGET(CoapExchange exchange) {
		exchange.respond("온도: 섭씨 " + temp + "도");
	}

	@Override
	public void handlePOST(CoapExchange exchange) {

	}
}
