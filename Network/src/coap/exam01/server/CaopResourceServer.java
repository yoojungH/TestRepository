package coap.exam01.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.network.CoapEndpoint;

public class CaopResourceServer {
	//Field
	private CoapServer coapServer;
	
	//Constructor
	public CaopResourceServer() {
		coapServer = new CoapServer();
		InetSocketAddress isa = new InetSocketAddress("192.168.3.42", 5683);
		coapServer.addEndpoint(new CoapEndpoint(isa));
		coapServer.add(new CoapResource01());
		coapServer.start();
	} 
	
	//Method
	public void shutdown() {
		coapServer.stop();
		coapServer.destroy();
	}
	
    public static void main(String[] args) throws IOException {
		CaopResourceServer server = new CaopResourceServer();
			System.out.println("CoAP server is listening on port 5683");
			System.in.read();
			server.shutdown();
	}
}
