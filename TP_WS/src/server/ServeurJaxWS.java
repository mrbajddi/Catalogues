package server;

import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServeurJaxWS {

	public static void main(String[] args) {
	String url="http://localhost:8989/";	 
	Endpoint.publish(url, new BanqueService());
	System.out.println(url);
	}

}
