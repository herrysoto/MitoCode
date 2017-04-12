package com.herry.basico.ejercicioaplicativo;

public class Libro {
	private String nombre;
	private int aniopublicacion;
	private String editorial;
	
	public Libro(){}
	
	
	
	public Libro(String nombre, int aniopublicacion, String editorial) {
		super();
		this.nombre = nombre;
		this.aniopublicacion = aniopublicacion;
		this.editorial = editorial;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAniopublicacion() {
		return aniopublicacion;
	}
	public void setAniopublicacion(int aniopublicacion) {
		this.aniopublicacion = aniopublicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
}
