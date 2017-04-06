package com.herry.basico.objeto;

public class Celular {
	String nombrecel;
	String colorcel;
	
	public Celular(String nombre,String color){
		this.nombrecel = nombre;
		this.colorcel = color;
	}
	
	public void llamar(){
		System.out.println(nombrecel + "-" + colorcel + " esta llamando ...");
	}
	
	public void llamadaEspecial(Celular ce){
		System.out.println(ce.nombrecel+"-"+ce.colorcel+" Esta llamando de manera especial...");
	}
}
