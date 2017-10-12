package com.udev.poo;

public class EjemploPerro {

	public static void main(String[] args) {
		//Creando una instancia con "new"
		Perro perro = new Perro();
		//Asignando valores a cada propiedad
		perro.nombre = "Pupie";
		perro.edad = 2;
		perro.peso = 25.5F;
		perro.raza = "Pitbull";
		//Imprimiendo las propiedades
		System.out.println("Nombre: " + perro.nombre);
		System.out.println("Raza: " + perro.raza);
		System.out.println("Peso: " + perro.peso);
		System.out.println("Edad: " + perro.edad);
		
		System.out.println("**********************");
		
		Perro perro2 = new Perro();
		perro2.nombre = "Firulais";
		perro2.edad = 1;
		perro2.peso = 1.0F;
		perro2.raza = "Pastor Aleman";
		System.out.println("Nombre: " + perro2.nombre);
		System.out.println("Raza: " + perro2.raza);
		System.out.println("Peso: " + perro2.peso);
		System.out.println("Edad: " + perro2.edad);
		
		
	}

}
