package com.udev.encapsulamiento;

public class UsarPato {

	public static void main(String[] args) {
		Pato pato = new Pato();
		//ya es accesible porque está marcado como
		//privado, es mejor utilizar el setter
		//pato.nombre = "Lucas";
		pato.setNombre("Lucas");
		pato.setColor("Negro");
		pato.setPeso(19.5F);
		
		System.out.println("Nombre: " + pato.getNombre());
		System.out.println("Peso: " + pato.getPeso());
		System.out.println("Color: " + pato.getColor());
	}

}
