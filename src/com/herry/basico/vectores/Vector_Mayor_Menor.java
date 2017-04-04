package com.herry.basico.vectores;

import java.util.Scanner;

public class Vector_Mayor_Menor {

	public static void main(String[] args) {
		String[] nombre = new String[3];
		int[] edad = new int[3];
		
		for (int i = 0; i < edad.length; i++) {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Ingrese el nombre: ");
			nombre[i] = teclado.next();
			System.out.print("Ingrese la edad: ");
			edad[i] = teclado.nextInt();
			System.out.println("");
		}
		System.out.println("-------------La lista es:------------------------");
		
		//obtener la edad mayor 
		int mayor = edad[0];
		int posicionmayor = 0;
		
		for (int i = 0; i < edad.length; i++) {
			if(edad[i]>mayor){
				mayor = edad[i];
				posicionmayor = i;
			}
		}
		System.out.println("La edad mayor es :" + mayor);
		System.out.println("El nombre de la persona mayor es:" + nombre[posicionmayor]);
		
		
		//obtener la edad menor
		int menor = edad[0];
		int posicionmenor = 0;
		for (int i = 0; i < edad.length; i++) {
			if(edad[i]<menor){
				menor = edad[i];
				posicionmenor = i;
			}
		}
		System.out.println("La edad menor es :" + menor);
		System.out.println("El nombre de la persona menor es:" + nombre[posicionmenor]);
	}
	

}
