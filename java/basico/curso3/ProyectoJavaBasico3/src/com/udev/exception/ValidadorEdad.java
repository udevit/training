package com.udev.exception;

public class ValidadorEdad {

	public void validar(int edad) throws EdadNoValidaException{
		if(edad < 0){
			throw new EdadNoValidaException("edad invalida");
		}
	}
	
	public static void main(String[] args) {
		ValidadorEdad v = new ValidadorEdad();
		try{
			v.validar(-1);
		}catch (EdadNoValidaException e) {
			e.printStackTrace();
		}
	}
	
}
