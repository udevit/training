package com.udev.polimorfismo;

public class UsoPoliformismo {

	public static void main(String[] args) {
		UsoPoliformismo po = new UsoPoliformismo();
		
		Correr accion = new PersonaGary();
		po.ejecutarAccion(accion);
		
	}
	
	/**
	 * El método ejecuta la acción de manera polimórfica
	 * ya que dependiendo de la instancia que venga es
	 * la forma en la que se va a comportar el método
	 * ya sea Perro, Gato o PersonaGary
	 * @param accion
	 */
	public void ejecutarAccion(Correr accion){
		accion.correr();
	}
	
}
