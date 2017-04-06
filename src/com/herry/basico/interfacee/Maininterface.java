package com.herry.basico.interfacee;

public class Maininterface {

	public static void main(String[] args) {
		SerVivo viv = new SerVivo();
		viv.MostrarNombre();
		viv.MostrarRaza();
		String tipo = viv.MostrarTipo();
		System.out.println(tipo);
	}

}
