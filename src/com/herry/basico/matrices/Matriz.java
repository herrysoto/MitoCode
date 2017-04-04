package com.herry.basico.matrices;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		int [][] matriz = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				Scanner teclado = new Scanner(System.in);
				System.out.println("Ingrese el valor de la matriz en la fila "+i+ " y en la columna " + j +":");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		
	}

}
