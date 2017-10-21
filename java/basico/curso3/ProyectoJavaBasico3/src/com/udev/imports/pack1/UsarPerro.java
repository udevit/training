package com.udev.imports.pack1;

public class UsarPerro {

	public static void main(String[] args) {
		Perro perro = new Perro();
		//el atributo edad no es visible, está marcado
		//como private
		//perro.edad = 3;
		perro.nombre = "like";
		
		//el atributo peso es visible dentro de las clases
		//que son partes del mismo paquete
		perro.peso = 0.45F;
	}

}
