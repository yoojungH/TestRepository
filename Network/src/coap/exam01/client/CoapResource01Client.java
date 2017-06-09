package coap.exam01.client;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.CoAP;

public class CoapResource01Client {
	//Field
	private CoapClient coapClient;
	
	//Constructor
	public CoapResource01Client() {
		coapClient = new CoapClient();
	}
					
	//Method
	public String get() {
		/* 생략 localhost:5683*/
		coapClient.setURI("coap://192.168.3.42/resource01");
		CoapResponse response = coapClient.get();
		
		/* CONTENT=2.05 --- 정상 응답 */
		if(response.getCode() == CoAP.ResponseCode.CONTENT){
			return response.getResponseText();
		}else{
			return null;
		}
	}
	
	public void shutdown() {
		coapClient.shutdown();
	}
	
	public static void main(String[] args) {
		CoapResource01Client client = new CoapResource01Client();
		String text = client.get();
		System.out.println(text);
		client.shutdown();
	}
}
