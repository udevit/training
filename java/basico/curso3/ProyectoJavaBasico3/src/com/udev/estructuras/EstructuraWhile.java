package com.udev.estructuras;

public class EstructuraWhile{

	public static void main(String[] args) {
		int contador = 0;
		while(contador <= 1000){
			System.out.println("Repitiendo..." + contador);
			contador++;
		}

		System.out.println("**************************************");
		contador = 1000;
		while(contador >= 0){
			System.out.println("Repitiendo..." + contador);
			contador--;
		}


		System.out.println("**************************************");
		contador = 0;
		while(contador <= 1000){
			if(contador % 2 == 0){
				System.out.println(contador);
			}
			contador++;
		}
	}

}