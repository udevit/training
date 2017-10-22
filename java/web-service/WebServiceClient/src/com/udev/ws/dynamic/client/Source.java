package com.udev.ws.dynamic.client;

public class Source {
	private String soapAction;
	private String reqXML;
	
	public Source(String soapAction, String reqXML){
		this.soapAction = soapAction;
		this.reqXML = reqXML;
	}

	public String getSoapAction() {
		return soapAction;
	}
	
	public String getReqXML() {
		return reqXML;
	}
	
}
