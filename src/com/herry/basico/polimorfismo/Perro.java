package com.herry.basico.polimorfismo;

public class Perro extends Animal{
	
	public Perro(String raza,String nombre, String tipo_alimentacion, int edad) {
		super(nombre, tipo_alimentacion, edad);
		this.raza =  raza;
	}

	private String raza;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void mostrar(){
		System.out.println(getNombre()+"-"+getEdad()+"-"+getTipo_alimentacion()+"-"+getRaza());
	}

	@Override
	public void alimentarse() {
		System.out.println("Soy un perro y me alimento de galletitas");
	}
}
