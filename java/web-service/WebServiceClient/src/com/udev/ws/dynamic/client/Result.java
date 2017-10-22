package com.udev.ws.dynamic.client;

public class Result {
	private int statusCode;
	private String respXML;
	
	public Result(int statusCode, String respXML){
		this.statusCode = statusCode;
		this.respXML = respXML;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getRespXML() {
		return respXML;
	}
	
}
