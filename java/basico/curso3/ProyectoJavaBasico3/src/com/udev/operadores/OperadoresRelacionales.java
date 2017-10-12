package com.udev.operadores;

public class OperadoresRelacionales{

	public static void main(String[] args) {
		
		//Operador relacional AND -> &&
		boolean res1 = true && true;
		System.out.println("true && true = " + res1);

		boolean res2 = true && false;
		System.out.println("true && false = " + res2);

		boolean res3 = false && true;
		System.out.println("false && true = " + res3);

		boolean res4 = false && false;
		System.out.println("false && false = " + res4);

		System.out.println("");

		//Operador relacional OR -> ||
		boolean res5 = true || true;
		System.out.println("true || true = " + res5);

		boolean res6 = true || false;
		System.out.println("true || false = " + res6);

		boolean res7 = false || true;
		System.out.println("false || true = " + res7);

		boolean res8 = false || false;
		System.out.println("false || false = " + res8);

		//Operador NOT (Negación)
		boolean res9 = !(false || false);
		System.out.println("!(false || false) = " + res9);
	}

}