package com.herry.basico.vectores;

import java.util.Scanner;

public class Vector_burbuja {

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
		
		//metodo burbuja con edades, comparar al vector de al lado y subirle de nivel(de menor a mayor)
		int aux;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2-i; j++) {
				if(edad[j]>edad[j+1]){
					aux=edad[j];
					edad[j]=edad[j+1];
					edad[j+1]=aux;
				}
			}
		}
		
		for(int valores : edad){
			System.out.println(valores);
		}
		
		
		//metodo burbuja con nombres, comparar al vector de al lado y subirle de nivel(de menor a mayor)
		
		String auxnombre;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2-i; j++) {
				if(nombre[j].compareTo(nombre[j+1]) > 0 ){ //compareto sirve para comparar el numero del orden alfabético
					auxnombre=nombre[j];
					nombre[j]=nombre[j+1];
					nombre[j+1]=auxnombre;
				}
			}
		}
		
		for(String valores : nombre){
			System.out.println(valores);
		}
		
	}

}
