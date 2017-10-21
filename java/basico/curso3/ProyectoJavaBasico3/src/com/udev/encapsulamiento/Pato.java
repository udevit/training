package com.udev.encapsulamiento;

public class Pato {
	private String nombre;
	private float peso;
	private String color;
	
	//getter (recuperan valor) && setter (establecen valor)
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public float getPeso(){
		return peso;
	}
	
	public void setPeso(float peso){
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
	
}
