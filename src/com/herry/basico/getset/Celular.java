package com.herry.basico.getset;

public class Celular {
	private String nombre;
	private String color;
	private String serie;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSerie() {
		if(serie == null){
			serie="SIN SERIE";
		}
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public void mostrar(){
		System.out.println(getNombre() + "-" + getColor() + "-"+getSerie());
	}
	
	
}
