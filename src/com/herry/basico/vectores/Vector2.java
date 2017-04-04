package com.herry.basico.vectores;

import java.util.Scanner;

public class Vector2 {

	public static void main(String[] args) {
		
		String[] nombre = new String[3];
		int[] edad = new int[3];
		
		for (int i = 0; i < edad.length; i++) {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Ingrese el nombre del arreglo "+i+":");
			nombre[i] = teclado.next();
			System.out.print("Ingrese la edad del arreglo "+i+":");
			edad[i] = teclado.nextInt();
			System.out.println("");
		}
		System.out.println("-------------La lista es:------------------------");
		for (int i = 0; i < edad.length; i++) {
			//agregando una validacion para que solo me imprima la edad de 23
//			if(edad[i]==23){
//				System.out.println(nombre[i] +" || "+ edad[i]);
//			}
			System.out.println(nombre[i] +" || "+ edad[i]);
		}
	}

}
