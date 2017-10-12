package com.udev.introduccion;

public class TipoDatos{

	public static void main(String args[]){
		/*
		Ejemplo de tipos de datos primitivos
		->Enteros
			1. byte
			2. short
			3. int
			4. long
		->Decimales (Entera + Decimal)
			5. float
			6. double
		->Caracteres (num codigo ascii ó algun caracter)
			7. char
		-> booleanos (true, false)
			8. boolean
		*/

		//Datos Enteros
		//tipo de dato nombreVariable = valor
		byte var1 = 10;
		System.out.println("Valor de var1 = " + var1);

		short var2 = 25;
		System.out.println("Valor de var2 = " + var2);

		int var3 = 45;
		System.out.println("Valor de var3 = " + var3);

		long var4 =5678433;
		System.out.println("Valor de var4 = " + var4);


		//Datos Decimales
		float var5 = 18.5F;
		System.out.println("Valor de var5 = " + var5);

		double var6 = 39.5;
		System.out.println("Valor de var6 = " + var6);

		//Datos caracteres
		char var7 = 'C';
		System.out.println("Valor de var7 = " + var7);

		char var8 = 58;
		System.out.println("Valor de var8 = " + var8);


		//Datos booleanos
		boolean esMexicano = false;

		System.out.println("Valor de esMexicano = " + esMexicano);

	}

}