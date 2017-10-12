package com.udev.poo.carrito;

public class EjemploRealizarCompra {

	public static void main(String[] args) {
		Producto prod1 = new Producto();
		prod1.nombre = "Coca cola";
		prod1.precio = 11.0F;
		prod1.cantidad = 2;
		
		Producto prod2 = new Producto();
		prod2.nombre = "Sabritas";
		prod2.precio = 8.5F;
		prod2.cantidad = 3;
		
		Producto productos[] = {prod1, prod2};
		
		/*Producto productos[] = new Producto[2];
		productos[0] = prod1;
		productos[1] =  prod2;*/
		
		CarritoCompras carrito = new CarritoCompras();
		carrito.productos = productos;
		
		//calculando el costo total de la compra
		for(Producto producto : carrito.productos){
			carrito.totalPagar += producto.precio * producto.cantidad; 
		}
		
		System.out.println("El total a pagar es: $" + carrito.totalPagar);
	}

}
