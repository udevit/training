package com.udev.imports.pack2;

public class UsarPerroOtroPaquete3 {

	public static void main(String[] args) {
		com.udev.imports.pack1.Perro perro = new com.udev.imports.pack1.Perro();
		//el atributo edad no es visible, está marcado
		//como private
		//perro.edad = 3;
		perro.nombre = "like";
		
		com.udev.imports.pack1.Gato gato = new com.udev.imports.pack1.Gato();
		gato.nombre = "Mizty";
		gato.peso = 0.34F;
		
	}

}
