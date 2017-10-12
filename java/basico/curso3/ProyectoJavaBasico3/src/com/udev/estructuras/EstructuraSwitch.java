package com.udev.estructuras;

public class EstructuraSwitch{

	public static void main(String[] args) {
		
		int dia = 1; //1-Lunes,2-Martes, ..., 7-Domingo

		//int, short, byte, char, Enum y String (Versión 7)
		switch(dia){
			case 1:
				System.out.println("Es lunes");
				break;  //break sirven para detener la ejeución de los demás casos
			case 2:
				System.out.println("Es Martes");
				break;
			case 3:
				System.out.println("Es Miercoles");
				break;
			case 4:
				System.out.println("Es Jueves");
				break;
			case 5:
				System.out.println("Es Viernes");
				break;
			case 6:
				System.out.println("Es Sabado");
				break;
			case 7:
				System.out.println("Es Domingo");
				break;
			default:
				System.out.println("El número ingresado no corresponde a un día de la semana");
		}

	}

}