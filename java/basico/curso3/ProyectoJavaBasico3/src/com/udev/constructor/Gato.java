package com.udev.constructor;

public class Gato {
	String nombre;
	int edad;
	float peso;
	
	//constructor por default
	Gato(){
		System.out.println("Se ejecutó el constructor por default");
	}
	
	/**
	 * Constructor sobrecragado mínimo
	 * @param nombre
	 */
	Gato(String nombre){
		System.out.println("Se ejecutó el constructor sobrecargado mínimo");
		this.nombre = nombre;
	}
	
	/**
	 * Constructor sobrecargado completo
	 * @param nombre
	 * @param edad
	 * @param pesoGato
	 */
	Gato(String nombre, int edad, float pesoGato){
		System.out.println("Se ejecutó el constructor sobrecargado completo");
		this.nombre = nombre;
		//en este caso usamo el identificador "this" para hacer referencia al atributo
		//de la clase, ya que ambos se llaman igual "peso"
		this.edad = edad;
		//en este caso omitimos el identificador "this" ya que
		//el atributo de clase tiene nombre diferente al parámetro
		//recibido, atributo de clase se llama "peso" y el parámetro "pesoGato"
		peso = pesoGato;
	}
	
	public static void main(String[] args) {
		//Por cada instancia se ejecuta una vez el constructor
		
		//invocando al constructor default
		Gato gato = new Gato();
		gato.nombre = "Mizti";
		gato.edad = 2;
		gato.peso = 150;
		System.out.println("Nombre: " + gato.nombre);
		
		//invocando al constructor sobrecargado mínimo
		Gato gato2 = new Gato("Felix");
		System.out.println("Nombre: " + gato2.nombre);
		
		//invocando al constructor sobrecargado completo
		Gato gato3 = new Gato("Lucy", 2, 150);
		System.out.println("Nombre: " + gato3.nombre);
	}
	
}
