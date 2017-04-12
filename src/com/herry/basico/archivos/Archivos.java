package com.herry.basico.archivos;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Archivos {

	public static void main(String[] args) throws Exception  {
		
		FileReader archivo = new FileReader("C:\\Users\\hsoto\\Desktop\\archivo\\hola.txt");
		BufferedReader buffer = new BufferedReader(archivo);
		
		
	}

}
