package com.udev.herencia;

public class EjemploHerencia {

	public static void main(String[] args) {
		Policia policia = new Policia();
		policia.nombre = "José";
		policia.colorOjos = "Verdes";
		
		Maestro maestro = new Maestro();
		maestro.nombre = "Pepe";
		maestro.colorOjos = "Cafés";
		
	}

}
