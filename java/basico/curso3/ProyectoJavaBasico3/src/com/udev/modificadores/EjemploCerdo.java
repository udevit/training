package com.udev.modificadores;

public class EjemploCerdo {

	public static void main(String[] args) {
		Cerdo cerdo = new Cerdo();
		//el modificador de acceso del atributo "tipos"
		//es default, se puede utilizar dentro de la misma clase
		//y dentro del mismo paquete
		cerdo.tipo = "Grande";
		
		//el modificador de acceso del atributo "peso" es de tipo
		//privado, es decir solo se puede utilizar dentro de la 
		//misma clase
		//cerdo.peso = 108.5F;
		
		//el modificador es publico, este atributo
		//es accesible desde cualquier lugar
		cerdo.altura = 1.5F;
	}

}
