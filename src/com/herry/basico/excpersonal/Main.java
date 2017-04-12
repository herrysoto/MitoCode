package com.herry.basico.excpersonal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws EdadExcepciones {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		int edad = teclado.nextInt();
		final int EDAD_MAXIMA=100;
		
//		try {
			if(edad<EDAD_MAXIMA){
				System.out.println("Bienvenido");
			}else{
				throw new EdadExcepciones("edad no permitida");
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
		}
	}

}
