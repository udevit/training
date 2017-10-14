package com.udev.poo.metodos;

public class EjemploMetodos {

	//tipo_retorno nombre_metodo(tipo_dato nomParam){
		//return
	//} 
	
	/**
	 * M�todo que no recibe par�meros e imprime el mensaje
	 * Bienvenido
	 */
	void muestraMensaje(){
		System.out.println("Bienvenido");
	}
	
	/**
	 * Lo que se define como firma del m�todo se les
	 * llama par�metros
	 * @param nombre
	 */
	void muestraMensaje(String nombre){
		System.out.println("Bienvenido " + nombre);
	}
	
	void muestraMensaje(String nombre, String apellidoPaterno){
		System.out.println("Bienvenido " + nombre + " " + apellidoPaterno);
	}
	
	/**
	 * El m�todo main es el principal, el responsable
	 * de invocar a las clases
	 * @param args
	 */
	public static void main(String[] args) {
		EjemploMetodos ej = new EjemploMetodos();
		//Cuando le paso el valor al m�todo
		//se llama argumentos
		ej.muestraMensaje("Gary", "Castellanos");	
	}

}