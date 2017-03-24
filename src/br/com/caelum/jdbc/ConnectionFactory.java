package br.com.caelum.jdbc;

import java.sql.*;

public class ConnectionFactory {

	public Connection getConnection() {
	     try {
	         return DriverManager.getConnection("jdbc:mysql://localhost/cadastro", "root", "5cd9987b1f73");
	         //pequeno teste
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
	
}
