package com.udev.poo;

public class Auto {
	String marca;
	int modelo;
	String transmision;
	float velocidad;
	
	void encender(){
		System.out.println("Encendido!");
	}
	
	void apagar(){
		System.out.println("Apagado!");
	}
	
	void acelerar(){
		velocidad++;
	}
	
	void frenar(){
		velocidad--;
	}
}
