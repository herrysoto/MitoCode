package com.herry.basico.polimorfismo;

//lo que quiere decir abstract es que no puede instanciarse 
public abstract class Animal {
	
	private String nombre;
	private String tipo_alimentacion;
	private int edad;
	
	
	public Animal(String nombre, String tipo_alimentacion, int edad) {
		super();
		this.nombre = nombre;
		this.tipo_alimentacion = tipo_alimentacion;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo_alimentacion() {
		return tipo_alimentacion;
	}
	public void setTipo_alimentacion(String tipo_alimentacion) {
		this.tipo_alimentacion = tipo_alimentacion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//este metodo obligatoriamente debe usarse en las clases hijas,y cada clase hija hara una cosa distinta
	public abstract void alimentarse();

}
