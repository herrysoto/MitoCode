package com.herry.basico.bd;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {

	
	public static Connection coon;
	public static Connection conectar() throws ClassNotFoundException, SQLException{
			Class.forName("oracle.jdbc.OracleDriver");
			String url = ("jdbc:oracle:thin:@10.0.0.125:1521:PRUEBA");
			coon=  DriverManager.getConnection(url,"A11012016","TEST");
		return coon;
	}
	
	public void crearTabla() throws SQLException{
		
	}
	
}
