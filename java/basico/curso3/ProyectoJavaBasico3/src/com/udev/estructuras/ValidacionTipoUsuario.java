package com.udev.estructuras;

public class ValidacionTipoUsuario{

	public static void main(String[] args) {
		int tipoUsuario = 1; //1-Normal, 2-Jefe de piso y 3-Administrador

		switch(tipoUsuario){
			case 1:
				System.out.println("Ingresó un Usuario Normal");
				break;
			case 2:
				System.out.println("Ingresó un Jefe de piso");
				break;
			case 3:
				System.out.println("Ingresó un Administrador");
				break;
			default:
				System.out.println("Tipo de usuario no reconocido!!");
		}

	}

}