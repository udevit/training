package com.udev.imports.pack2;

//import nombre_del_paquete.*;
import com.udev.imports.pack1.*;

public class UsarPerroOtroPaquete2 {

	public static void main(String[] args) {
		Perro perro = new Perro();
		//el atributo edad no es visible, está marcado
		//como private
		//perro.edad = 3;
		perro.nombre = "like";
		
		Gato gato = new Gato();
		gato.nombre = "Mizty";
		gato.peso = 0.34F;
		
	}

}
