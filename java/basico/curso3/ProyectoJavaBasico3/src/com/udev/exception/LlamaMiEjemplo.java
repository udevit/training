package com.udev.exception;

import java.io.FileNotFoundException;

public class LlamaMiEjemplo {

	public static void main(String[] args) {
		MiEjemplo m = new MiEjemplo();
		try{
			m.escribeArchivo();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
