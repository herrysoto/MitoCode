package com.herry.basico.fechas;

import java.util.Calendar;


public class Fechas {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		int anio = calendario.get(Calendar.YEAR);
		System.out.println(anio);
	}

}
