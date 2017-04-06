package com.herry.basico.polimorfismo;

public class Caballo extends Animal{

	public Caballo(String nombre, String tipo_alimentacion, int edad) {
		super(nombre, tipo_alimentacion, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alimentarse() {
		System.out.println("Soy un caballo y me alimento de hierba");
		
	}
	 
	
}
