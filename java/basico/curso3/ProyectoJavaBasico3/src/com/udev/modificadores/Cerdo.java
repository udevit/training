package com.udev.modificadores;

/**
 * private
 * protected
 * default
 * public
 * @author Gary
 *
 */
public class Cerdo {
	private float peso;
	//default
	String tipo;
	public float altura;
	protected String color;
	
	void comer(){
		//solo se puede utilizar dentro de la misma clase
		peso++;
	}
}
