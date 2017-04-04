package com.herry.basico.vectores;

import java.util.Iterator;
import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		System.out.println("Ingrese el tamaño del vector :");
		Scanner teclado = new Scanner(System.in);
		int tamano = teclado.nextInt();
		String[] vector = new String[tamano];
		System.out.println();
		for (int j = 0; j < vector.length; j++) {
			System.out.println("Ingrese el valor de la posición "+ j + ":");
			vector[j]= teclado.next();
		}
		System.out.println("-----------------El resultado es-----------------");
//		vector[0] = "hola";
//		vector[1] = "mundo";
		for(String s : vector){
			System.out.println(s);
		}
	}

}
