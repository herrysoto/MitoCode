package com.herry.basico.objeto;

public class Objetos {

	public static void main(String[] args) {
		Celular cel = new Celular("LG", "GRIS");
//		cel.llamar();
		
		Celular cel2 = new Celular("HTC","azul");
		cel2.llamadaEspecial(cel);
	}

}