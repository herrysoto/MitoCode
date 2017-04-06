package com.herry.basico.stringbuilder;

public class Main {

	public static void main(String[] args) {
		long tiempo_inicio = System.nanoTime();
		
		StringBuilder texto = new StringBuilder();
		
		for (int i = 0; i < 1000; i++) {	
			texto.append(i);
		}
		
		long tiempo_fin = System.nanoTime();
		double diferencia = (tiempo_fin-tiempo_inicio);
		
		System.out.println(diferencia);
		
	}

}
