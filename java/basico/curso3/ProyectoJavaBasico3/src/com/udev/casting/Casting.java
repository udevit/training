package com.udev.casting;

public class Casting {

	public static void main(String[] args) {
		//categoría de los enteros
		//byte, short, int, long
		int varInt = 18;
		
		//Cast de int a short
		short varShort = (short)varInt;
		System.out.println("varShort: " + varShort);
		
		int varInt2 = varShort;
		System.out.println("varInt2: " + varInt2);
		
		long varLong = 127;
		int varInt3 = (int)varLong;
		System.out.println("varInt3: " + varInt3);
		
		byte varByte = (byte)varLong;
		System.out.println("varByte: " + varByte);
		
		double varDouble = 18.5;
		float varFloat = (float)varDouble;
		System.out.println("varFloat: " + varFloat);
		
	}

}
