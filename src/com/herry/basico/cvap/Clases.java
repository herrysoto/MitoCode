package com.herry.basico.cvap;

public class Clases {
	
	String nombre;
	int edad;
	
	public void saludar(String nombre){
		System.out.println("Hola " + nombre);
	}
	
	public void despedir(String nombre,int edad){
		System.out.println("Adios " + nombre + " la edad es: " +edad);
	}
	
	//retorna valores
	public String saludarret(String nombre,int edad){
		return nombre + edad;
	}


	public static void main(String[] args) {
		Clases cl = new Clases();
		cl.saludar("juan");
		cl.despedir("pedro", 25);
		String retorno = cl.saludarret("augusto", 23);
		System.out.println(retorno);
	}

}
