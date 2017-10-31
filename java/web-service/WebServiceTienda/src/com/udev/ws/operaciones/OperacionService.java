package com.udev.ws.operaciones;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name="OperacionPortType", 
	targetNamespace="http://ws.udev.com/")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, 
	use=SOAPBinding.Use.LITERAL, 
	parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface OperacionService {
	@WebMethod(operationName="operSuma")
	@WebResult(name="resultado", targetNamespace="http://ws.udev.com/")
	public Integer suma(
		@WebParam(name="oper1", targetNamespace="http://ws.udev.com/") Integer operando1, 
		@WebParam(name="oper2", targetNamespace="http://ws.udev.com/") Integer operando2)
		throws NumberValidationException;
	
	@WebMethod(operationName="operResta")
	@WebResult(name="resultado", targetNamespace="http://ws.udev.com/")
	public Integer resta(
		@WebParam(name="oper1", targetNamespace="http://ws.udev.com/") Integer operando1, 
		@WebParam(name="oper2", targetNamespace="http://ws.udev.com/") Integer operando2)
		throws NumberValidationException;
}
