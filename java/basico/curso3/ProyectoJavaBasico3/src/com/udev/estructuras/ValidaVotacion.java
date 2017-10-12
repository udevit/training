package com.udev.estructuras;

public class ValidaVotacion{

	public static void main(String[] args) {
		
		int edad = 10;

		//Primera forma
		if(edad >= 18){
			System.out.println("Puedes Votar");
		}else{
			System.out.println("No Puedes Votar");
		}

		//Segunda forma
		if(edad < 18){
			System.out.println("No Puedes Votar");
		}else{
			System.out.println("Puedes Votar");
		}
	}

}