package com.udev.arreglos;

public class Arreglos{

	public static void main(String[] args) {
		//1. Declaración/Inicialización en una sola línea
		int[] edades = {10, 28, 35, 17, 21};

		//2. Declaración de un arreglo
		float[] pesos = new float[5];

		//inicializamos
		pesos[0] = 80.0F;
		pesos[1] = 37.8F;
		pesos[2] = 28.2F;
		pesos[3] = 93.7F;
		pesos[4] = 55.3F;

		System.out.println("Pesos en la posición 0 = " + pesos[0]);
		System.out.println("Pesos en la posición 1 = " + pesos[1]);

		System.out.println("****************");
		for(int i = 0; i < edades.length; i++ ){
			System.out.println(edades[i]);
		}

		//La propiedad "length" recupera el número de elementos
		//almacenados en el arreglo
		System.out.println("Tamaño arreglo edades: " + edades.length);
		System.out.println("Tamaño arreglo pesos: " + pesos.length);


	}

}