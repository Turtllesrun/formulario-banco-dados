package br.com.progweb.jdbc.contatodao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.progweb.jdbc.*;

public class ContatoDao {
	
	private Connection connection;
	
	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Contato contato) {
		
		String sql ="insert into funcionarios"+"(nome,usuario,senha)"+"values(?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getUsuario());
			stmt.setString(3, contato.getSenha());
			stmt.execute();
			stmt.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
			
		}
	}
}
