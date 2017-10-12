package com.udev.operadores;

public class OperadoresIncremento{

	public static void main(String[] args) {
		int suma = 0;
		int numA = 5;
		int numB = 8;

		//numA++ + numB
		//5 + 8

		//++numA + numB
		//6 + 8

		suma = numA++ + ++numB;

		System.out.println("Suma: " + suma);
			
	}
}