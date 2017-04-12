package com.herry.basico.excepciones;

public class Excepciones {
	
	private void proceso1(){
		int a=10,b=0;
		
		int division = a/b;
		System.out.println(division);
	}

	public static void main(String[] args) {
		
		try{
			//Se realiza el proceso 
			Excepciones carga = new Excepciones();
			carga.proceso1();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			//Si en el proceso no se pudo completar la accion o encontró algo malo pues entra aquí	
		}
		finally{
			//Si o si al realizar el try o el catch entra aquí
		}
	}

}
