package com.udev.operadores;

public class OperadoresDecremento{

	public static void main(String[] args) {
		int res = 0;
		int numA = 8;
		int numB = 2;

		res = numA-- + --numB;

		System.out.println("Res: " + res);
	}

}