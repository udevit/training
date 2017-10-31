package com.udev.ws.operaciones;

import javax.jws.WebService;

@WebService(serviceName="OperacionServiceWS",
	portName="OperacionPort",
	targetNamespace="http://ws.udev.com/", 
	endpointInterface="com.udev.ws.operaciones.OperacionService") //SEI
public class OperacionServiceImpl implements OperacionService{
	
	public Integer suma(Integer operando1, Integer operando2) 
		throws NumberValidationException{
		if(operando1 <0 ){
			throw new NumberValidationException("No se permiten numeros negativos");
		}
		return operando1 + operando2;
	}

	public Integer resta(Integer operando1, Integer operando2) 
		throws NumberValidationException {
		if(operando1 <0 ){
			throw new NumberValidationException("No se permiten numeros negativos");
		}
		return operando1 - operando2;
	}
	
}