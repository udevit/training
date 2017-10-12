package com.udev.operadores;

public class OperadorTernario{

	public static void main(String[] args) {
		
		float totalCompra = 110.0F;
		float descuento = 0.0F;

		//si total de compra es mayor a $105 entonces voy a aplicar un descuento 
		//del 20%, en caso contrario solo aplicaré un 5% de descuento

		//Utilizando un simple estructura if-else
		if(totalCompra > 105.0F){
			//aplicar el 20%
			descuento = 0.2F;
		}else{
			//aplicar el 5%
			descuento = 0.05F;
		}

		//Utilizando un operador ternario
		descuento = totalCompra > 105.0F ? 0.2F : 0.05F; 

		System.out.println("Total de la compra: " + totalCompra);
		System.out.println("Descuento: " + descuento);
	}

}