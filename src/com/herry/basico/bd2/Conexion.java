package com.herry.basico.bd2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conexion {
	
	public String solicitarvarios(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar el nombre:");
		String nombre = teclado.next();
		return nombre;
	}
	
	public void registrarbd(String valorteclado)  throws SQLException{
		final String JDBC_DRIVER="oracle.jdbc.OracleDriver" ;
		final String BD_URL="jdbc:oracle:thin:@10.0.0.125:1521:PRUEBA" ;
		final String USER="A11012016" ;
		final String PASS="TEST" ;
		
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(BD_URL, USER, PASS);
			
			PreparedStatement st = conn.prepareStatement("INSERT INTO PRUEBABD(ID,NOMBRE) VALUES('3',?)");
			st.setString(1, valorteclado);
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			e.getMessage();
		}finally{
			if(conn != null){
				if(!conn.isClosed()){
					conn.close();
				}
			}
		}
	}
	
	public List<Persona> listar() throws SQLException{
		List<Persona> listahh = null;
		final String JDBC_DRIVER="oracle.jdbc.OracleDriver" ;
		final String BD_URL="jdbc:oracle:thin:@10.0.0.125:1521:PRUEBA" ;
		final String USER="A11012016" ;
		final String PASS="TEST" ;
		
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(BD_URL, USER, PASS);
			PreparedStatement st = conn.prepareStatement("select * from PRUEBABD");
			 listahh = new ArrayList();
			ResultSet rs =  st.executeQuery();
			while (rs.next()) {
				Persona bhh = new Persona();
				bhh.setId(rs.getString("id"));
				bhh.setNombre(rs.getString("nombre"));
				listahh.add(bhh);
			}
			st.close();
		} catch (Exception e) {
			e.getMessage();
		}
		
		return listahh;
	}

	public static void main(String[] args) throws SQLException {
		Conexion co = new Conexion();
		
		//insertar en la base de datos
//		String valor =co.solicitarvarios();
//		if(valor != null){
//			co.registrarbd(valor);
//		}
		
		//listar en la bd
		List<Persona> lista = co.listar();
		for(Persona per : lista){
			System.out.println("El nombre de la persona es : "+per.getNombre()+" y su ID ES : " + per.getId());
		}
		
	}

}
