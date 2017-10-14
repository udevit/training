package com.udev.poo.metodos;

public class EjemploMetodos {

	//tipo_retorno nombre_metodo(tipo_dato nomParam){
		//return
	//} 
	
	/**
	 * Método que no recibe parámeros e imprime el mensaje
	 * Bienvenido
	 */
	void muestraMensaje(){
		System.out.println("Bienvenido");
	} 
	
	/**
	 * El método main es el principal, el responsable
	 * de invocar a las clases
	 * @param args
	 */
	public static void main(String[] args) {
		EjemploMetodos ej = new EjemploMetodos();
		ej.muestraMensaje();
	}

}