package com.herry.basico.interfacee;

public class SerVivo implements IAnimal,IPerro{

	@Override
	public void MostrarNombre() {
		System.out.println("El nombre es Gorky");
		
	}

	@Override
	public String MostrarTipo() {
		return "Kaiser";
		
	}

	@Override
	public void MostrarRaza() {
		System.out.println("La raza es cocker");
		
	}

}
