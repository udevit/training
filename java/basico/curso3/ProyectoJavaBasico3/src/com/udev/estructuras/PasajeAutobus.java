package com.udev.estructuras;

public class PasajeAutobus{

	public static void main(String[] args) {
		int tipoPasajero = 2; //1.Adulto, 2. Niño y 3. Adulto Mayor
		int edad = 4;
		float descuento = 0.0F;
		float tarifaBase = 7.0F;
		float precioFinal = 0.0F;

		//opción 1
		if(tipoPasajero == 1){  //Adulto
			descuento = 0.0F; //sin descuento
		}else if(tipoPasajero == 2){  //Niño
			if(edad < 5){
				descuento = tarifaBase;
			}else{
				descuento = tarifaBase * 0.5F;
			}
		}else if(tipoPasajero == 3){  //Adulto Mayor
			descuento = tarifaBase * 0.50F; //50% de descuento
		}

		//opción 2
		if(tipoPasajero == 1){  //Adulto
			descuento = 0.0F; //sin descuento
		}else if(tipoPasajero == 2 && edad < 5){  //Niño
			descuento = tarifaBase;
		}else if(tipoPasajero == 2 && edad >=5){  //Niño
			descuento = tarifaBase * 0.5F;
		}else if(tipoPasajero == 3){  //Adulto Mayor
			descuento = tarifaBase * 0.50F; //50% de descuento
		}

		precioFinal = tarifaBase - descuento;
		System.out.println("Precio: " + precioFinal);
	}

}