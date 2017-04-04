package com.herry.basico.matrices;

import java.util.Scanner;

public class Operacion_Con_Matriz {

	public static void main(String[] args) {
		//imprimir solo la diagonal
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
				if(i==j){ // para imprimir solo la diagonal
			   // if(j==0){//para imprimir solo la primera fila
				System.out.print(matriz[i][j]+"\t");
				}else{
					System.out.print(0+"\t");
				}
			}
			System.out.print("\n");
		}
	}

}
