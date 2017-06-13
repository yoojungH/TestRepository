package coap.exam04.client;

import java.io.IOException;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapHandler;
import org.eclipse.californium.core.CoapObserveRelation;
import org.eclipse.californium.core.CoapResponse;

public class CoapResource03Client {
	//Field
	private CoapClient coapClient;
	private CoapObserveRelation coapObserveRelation; //관찰 요청 클라이언트
	//Constructor
	public CoapResource03Client() {
		coapClient = new CoapClient();
	}
	//Method
	public void observe() {
		coapClient.setURI("coap://192.168.3.42/resource03");
		coapObserveRelation = coapClient.observe(new CoapHandler() {
			//통보 메시지가 왔을 때
			@Override
			public void onLoad(CoapResponse response) {
				String text = response.getResponseText();
				System.out.println(text);
			}
			@Override
			public void onError() {
				
			}
		}); //비동기 방식
	}
	public void shutdown() {
		coapObserveRelation.proactiveCancel();
		coapClient.shutdown();
	}
	
	public static void main(String[] args) throws IOException {
		CoapResource03Client client = new CoapResource03Client();
		client.observe();
		System.in.read();
		client.shutdown();
	}
}

