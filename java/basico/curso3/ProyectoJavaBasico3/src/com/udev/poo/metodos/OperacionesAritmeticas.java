package com.udev.poo.metodos;

/**
 * Crear una clase llamada "OperacionesAritmeticas"
 * y definir los siguientes métodos:
	1. mostrar funcionalidad
		Mostrar un mensaje "Clase encargada de realizar las operaciones básica"

	2. realizar un método que imprima la suma de 2 números 
	3. realizar un método que imprime la suma de 3 numeros
	4. realizar un método que imprime la suma de 4 numeros

	5. realizar un método que realice la suma de 2 números y regrese
		el resultado.
	6. realizar un método que realice la suma de 3 números y regrese
		el resultado
	7. realizar un método que realice la suma de 4 números y regrese
		el resultado
 * @author Gary
 *
 */
public class OperacionesAritmeticas {
	
	/**
	 * Método del requerimiento 1
	 */
	void mostrarFuncionalidad(){
		System.out.println("Clase encargada de realizar "
			+ "las operaciones aritmeticas básicas");
	}
	
	/**
	 * Método del requerimiento 2
	 * @param num1
	 * @param num2
	 */
	void suma(int num1, int num2){
		int res = num1 + num2;
		System.out.println("La suma es: " + res);
	}
	
	/**
	 * Método del requerimiento 3
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	void suma(int num1, int num2, int num3){
		int res = num1 + num2 + num3;
		System.out.println("La suma es: " + res);
	}
	
	/**
	 * Método del requerimiento 4
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 */
	void suma(int num1, int num2,int num3, int num4){
		int res = num1 + num2 + num3 + num4;
		System.out.println("La suma es: " + res);
	}
	
	/**
	 * Método del requerimiento 5
	 * @param num1
	 * @param num2
	 * @return
	 */
	int suma2(int num1, int num2){
		int res = num1 + num2;
		return res;
	}
	
	/**
	 * Método del requerimiento 6
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	int suma2(int num1, int num2, int num3){
		int res = num1 + num2 + num3;
		return res;
	}
	
	/**
	 * Método del requerimiento 7
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 * @return
	 */
	int suma2(int num1, int num2, int num3, int num4){
		int res = num1 + num2 + num3+ num4;
		return res;
	}
	
	void division(float num1, float num2){
		float res = 0;
		if(num2 > 0){
			res = num1 / num2;
			System.out.println("La división es: " + res);
		}else{
			System.out.println("La división no se puede realizar");
		}
	}
	
	public static void main(String[] args) {
		OperacionesAritmeticas op = new OperacionesAritmeticas();
		op.mostrarFuncionalidad();
		
		op.suma(2, 4);
		op.suma(2, 4, 8);
		op.suma(2, 4, 8, 16);
		
		//métodos que retornan valor
		int res1 = op.suma2(2, 4);
		System.out.println("La suma es: " + res1);
		
		int res2 = op.suma2(2, 4, 8);
		System.out.println("La suma es: " + res2);
		
		int res3 = op.suma2(2, 4, 16);
		System.out.println("La suma es: " + res3);
		
		op.division(10, 0);
	}
}
