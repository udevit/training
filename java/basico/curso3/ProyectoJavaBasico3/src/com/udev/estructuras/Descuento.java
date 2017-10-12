package com.udev.estructuras;

public class Descuento{

	/*
	1. Roja: 30%
	2. Azul: 25%
	3. Verde: 15%
	4. Negra: 50%
	*/
	public static void main(String[] args) {
		int colorEtiqueta = 1;
		float montoCompra = 100.0F;
		float descuento = 0.0F;
		float montoAPagar = 0.0F;

		if(colorEtiqueta == 1){
			//Aplicar descuento del 30%
			descuento = montoCompra * 0.30F;
		}else if(colorEtiqueta == 2){
			//Aplicar descuento del 25%
			descuento = montoCompra * 0.25F;
		}else if(colorEtiqueta == 3){
			//Aplicar descuento del 15%
			descuento = montoCompra * 0.15F;
		}else if(colorEtiqueta == 4){
			//Aplicar descuento del 50%
			descuento = montoCompra * 0.5F;
		}else{
			//Mensaje de error
			descuento = 0.0F;
		}
		montoAPagar = montoCompra - descuento;
		System.out.println("SubTotal: " + montoCompra);
		System.out.println("Total: " + montoAPagar);
		System.out.println("Descuento: " + descuento);
	}

}