package br.com.progweb.jdbc;

import br.com.progweb.jdbc.contatodao.ContatoDao;



import br.com.progweb.jdbc.contatodao.*;
public class AdicionarFuncionarios {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		Contato ctn = new Contato();
		ctn.setNome("ss");
		ctn.setSenha("aaa");
		ctn.setUsuario("SetaBurro");
		dao.adiciona(ctn);

	}

}
