package com.udev.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MiEjemplo {

	public void escribeArchivo() throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(new File("test.txt"));
		pw.write("test");
		pw.close();
	}
	
}
