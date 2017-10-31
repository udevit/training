package com.udev.ws.operaciones;

import javax.xml.ws.WebFault;

@WebFault(name="faultException",
	messageName="myFault", 
	targetNamespace="http://ws.udev.com/")
public class NumberValidationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumberValidationException(String msg){
		super(msg);
	}
}
