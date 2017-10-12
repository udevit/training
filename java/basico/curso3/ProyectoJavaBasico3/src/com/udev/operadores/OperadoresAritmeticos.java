package com.udev.operadores;

public class OperadoresAritmeticos{

	public static void main(String args[]) {
		int suma, resta, multiplicacion, modulo;
		float division;

		suma = 10 + 8;

		System.out.println("La suma de 10 + 8 = " + suma);

		resta = 10 - 8;
		System.out.println("La resta de 10 - 8 = " + resta);

		multiplicacion = 10 * 8;
		System.out.println("La mult de 10 * 8 = " + multiplicacion);

		division = 10.0F / 3.0F;
		System.out.println("La division de 10 / 3 = " + division);

		modulo = 10 % 8;
		System.out.println("EL modulo de 10 % 8 = " + modulo);
	}

}