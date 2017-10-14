package com.udev.poo;

public class PruebaAuto {

	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.marca = "VW";
		auto.modelo = 2017;
		auto.transmision = "TA";
		
		System.out.println("Velocidad: " + auto.velocidad);
		
		auto.encender();
		
		auto.acelerar();
		auto.acelerar();
		auto.acelerar();
		
		System.out.println("Velocidad: " + auto.velocidad);
		
		auto.frenar();
	
		System.out.println("Velocidad: " + auto.velocidad);
		
		auto.apagar();
	}

}
