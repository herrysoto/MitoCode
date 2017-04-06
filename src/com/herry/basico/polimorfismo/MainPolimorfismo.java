package com.herry.basico.polimorfismo;

public class MainPolimorfismo {

	public static void main(String[] args) {
		Animal an1 = new Perro("dasd", "dwad", "dad", 15);
		an1.alimentarse();
		
		Animal an2 = new Caballo("dasd", "dwad", 15);
		an2.alimentarse();
	}

}
