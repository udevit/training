package com.udev.arreglos;

public class Matrices{

	public static void main(String[] args) {
		/*
		(0,0)    (0,1)    (0,2)
	    (1,0)    (1,1)    (1,2)
	    (2,0)    (2,1)    (2,2)
	    (3,0)    (3,1)    (3,2)
	    */
	    int[][] matriz = { {10, 30, 5}, {7, 36, 18}, {26, 28, 19} };

	    int[][] matriz2 = new int[4][3];  //matriz de 4 X 3

	    matriz2[0][0] = 18;
	    matriz2[0][1] = 25;
	    matriz2[0][2] = 38;

	    System.out.println("Tamaño filas: " + matriz.length);
	    System.out.println("Tamaño de columnas de la fila 0: " + matriz[0].length);

	    System.out.println("***************************");
	    for(int x = 0; x < matriz.length; x++){
	    	for(int y = 0; y < matriz[x].length; y++){
	    		System.out.print(matriz[x][y] + "    ");
	    	}
	    	System.out.println();
	    }

	}

}