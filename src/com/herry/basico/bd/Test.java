package com.herry.basico.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Test bd = new Test();
//		Conexion conectar = Conexion.getInstance();
//		Connection conn;
//		try {
//			conn = Conexion.conectar();
//			System.out.println(conn.toString());
//		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		List<BeanHH> lista = bd.listar();
		for(BeanHH numcodigo : lista){
			System.out.println("El número máximo de horas hombre es :"+numcodigo.getNumcodigo());
		}
	}
	
	public List<BeanHH> listar(){
		List<BeanHH> listahh = null;
		Connection conn;
		try {
			conn = Conexion.conectar();
			PreparedStatement st = conn.prepareStatement("SELECT NVL(MAX(NUMCODIGO),0) + 1  NUMCODIGO FROM HORASHOMBRE");
			 listahh = new ArrayList();
			ResultSet rs =  st.executeQuery();
			while (rs.next()) {
				BeanHH bhh = new BeanHH();
				bhh.setNumcodigo(rs.getInt("numcodigo"));
				listahh.add(bhh);
			}
			st.close();
		} catch (Exception e) {
			e.getMessage();
		}
		
		return listahh;
	}

}
