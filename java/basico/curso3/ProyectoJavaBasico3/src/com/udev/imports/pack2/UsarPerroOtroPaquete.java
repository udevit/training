package com.udev.imports.pack2;

//import nombre_del_paquete.MiClase;
import com.udev.imports.pack1.Perro;
import com.udev.imports.pack1.Gato;

public class UsarPerroOtroPaquete {

	public static void main(String[] args) {
		Perro perro = new Perro();
		
		//el atributo edad no es visible, está marcado
		//como private
		//perro.edad = 3;
		perro.nombre = "like";
		
		//el atributo peso no es visible ya que está marcado
		//con default, su visibilidad es únicamente
		//por elementos dentro del mismo paquete
		//perro.edad = 0.5F;
		
		//el atributo color no es visible, está marcado como
		//protected, su visibilidad es la misma que la del atributo
		//marcado como default, pero si se requiere acceder
		//a este atributo fuera del paquete, es necesario
		//realizar herencia
		//perro.color = "Negro";
		
		Gato gato = new Gato();
		gato.nombre = "mizty";
		gato.peso = 0.22F;
	}

}
