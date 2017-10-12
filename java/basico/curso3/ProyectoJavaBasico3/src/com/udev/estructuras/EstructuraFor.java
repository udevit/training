package com.udev.estructuras;

public class EstructuraFor{

	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 1000; contador++){
			System.out.println("Repitiendo...." + contador);
		}

		System.out.println("**************************************");

		for(int contador = 1000; contador >=0 ; contador--){
			System.out.println("Repitiendo...." + contador);
		}		

		System.out.println("**************************************");

		for(int contador = 0; contador <= 1000; contador++){
			if(contador % 2 == 0){
				System.out.println(contador);
			}
		}

	}

}