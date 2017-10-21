package com.udev.polimorfismo;

public class Perro implements Correr, Brincar, Nadar{

	public void correr() {
		System.out.println("Corriendo como Perro");
	}

	public void brincar() {
		System.out.println("Brincando como Perro");
	}

	public void nadar() {
		System.out.println("Nadando como Pato");
	}

}
