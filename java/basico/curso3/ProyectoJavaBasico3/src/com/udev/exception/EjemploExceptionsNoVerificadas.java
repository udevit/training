package com.udev.exception;

public class EjemploExceptionsNoVerificadas {

	public float divideNumeros(int numA, int numB){
		float res = 0;
		res = numA / numB;
		return res;
	}
	
	public void calculaTamanioArreglo(int array[]){
		System.out.println(array.length);
		System.out.println(array[5]);
	}
	
	public static void main(String[] args) {
		System.out.println("Inicia ejecuci�n");
		EjemploExceptionsNoVerificadas e = new EjemploExceptionsNoVerificadas();
		System.out.println("Antes de invocar al m�todo");
		try{
			float res = e.divideNumeros(10, 1);
			System.out.println("Despu�s de invocar al m�todo");
			System.out.println(res);
			e.calculaTamanioArreglo(new int[]{10});
		}catch (ArithmeticException ex) {
			System.err.println("Error, no divisible entre cero");
		}catch (NullPointerException ex) {
			System.err.println("No se instanciado la clase");
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("El indice del arreglo especificado no existe");
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
