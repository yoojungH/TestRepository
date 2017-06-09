package coap.exam01.server;

import org.eclipse.californium.core.CoapServer;

public class CaopResourceServer {
	//Field
	private CoapServer coapServer;
	
	//Constructor
	public CaopResourceServer() {
		coapServer = new CoapServer();
		coapServer.add(new CoapResource01());
		coapServer.start();
	} 
	
	//Method
	public void shutdown() {
		coapServer.stop();
		coapServer.destroy();
	}
	
    public static void main(String[] args) {
		CaopResourceServer server = new CaopResourceServer();
			System.out.println("CoAP server is listening on port 5683");
	}
}
