package com.udev.modificadores2;

//se importa la clase que se cuentra
//dentro de otro paquete
import com.udev.modificadores.Cerdo;

public class EjemploCerdo2 {

	public static void main(String[] args) {
		Cerdo cerdo = new Cerdo();
		//error ya que el atributo tipo tiene el modificador
		//default, es decir solo se puede utilizar dentro
		//de la misma clase y mismo paquete
		//cerdo.tipo = "Grande";
		
		//el modificador es publico, este atributo
		//es accesible desde cualquier lugar
		cerdo.altura = 1.5F;
		
		//el modificador es protegido, este atributo tiene
		//el mismo comportamiento que el modificador default
		//pero si se va a utilizar en otro paquete solo
		//es accesible por medio de herencia
		//cerdo.color = "Negro";
	}

}
