package br.com.progweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/db_alunos","root", "facnet");
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
