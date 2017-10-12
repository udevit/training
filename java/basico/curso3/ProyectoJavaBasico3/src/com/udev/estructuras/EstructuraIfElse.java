package com.udev.estructuras;

public class EstructuraIfElse{

	public static void main(String[] args) {
		int numA = 10;
		int numB = 20;

		boolean res = numA > numB;

		//si la condición es verdadera o true
		//entonces se imprime el mensaje
		if(res){
			System.out.println("NumA es mayor a NumB");
		}else{
			System.out.println("NumA es menor a NumB");
		}
	}

}