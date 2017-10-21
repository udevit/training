package com.udev.imports.pack1;

public class Perro {
	public String nombre;
	private int edad;
	float peso; //modificador default
	protected String color;
	
	
	public void ladrar(){
		System.out.println("Ladrando!!!");
	}
	
	public void imprimeEdad(){
		System.out.println("Edad: " + edad);
	}
}
