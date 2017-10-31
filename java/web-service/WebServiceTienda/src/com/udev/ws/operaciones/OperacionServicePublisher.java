package com.udev.ws.operaciones;

import javax.xml.ws.Endpoint;

public class OperacionServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/OperacionService", 
			new OperacionServiceImpl());
	}

}
