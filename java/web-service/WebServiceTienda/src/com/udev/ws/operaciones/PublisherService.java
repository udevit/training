package com.udev.ws.operaciones;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class PublisherService {
	
	@Oneway
	@WebMethod(operationName="enviarMensaje")
	public void publicarMsg(String msg){
		System.out.println("Enviando > " + msg);
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/PublisherService", new PublisherService());
	}
}
