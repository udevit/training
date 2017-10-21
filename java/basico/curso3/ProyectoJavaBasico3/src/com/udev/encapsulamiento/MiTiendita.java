package com.udev.encapsulamiento;

public class MiTiendita {
	private float descueto;
	
	public void calcularDescuento(int edad, float precio){
		if(edad >= 50){
			descueto = 0.8F;
		}else{
			descueto = 0.3F;
		}
		System.out.println(precio * descueto);
	}
}
