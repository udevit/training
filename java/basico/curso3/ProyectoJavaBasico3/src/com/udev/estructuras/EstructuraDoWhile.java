package com.udev.estructuras;

public class EstructuraDoWhile{

	public static void main(String[] args) {
		int contador = 0;
		do{
			System.out.println("Repitiendo... " + contador);
			contador++;
		}while(contador <= 100);

		System.out.println("************************");
		contador = 1000;
		do{
			System.out.println("Repitiendo... " + contador);
			contador--;
		}while(contador >= 0);


		System.out.println("************************");
		contador = 0;
		do{
			if(contador % 2 == 0){
				System.out.println("Repitiendo... " + contador);
			}
			contador++;
		}while(contador <= 100);

	}


}