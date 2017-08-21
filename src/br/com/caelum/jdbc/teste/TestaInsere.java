package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import dao.ContatoDao;
import modelo.Contato;

public class TestaInsere {
	 public static void main(String[] args) {
		 	// pronto para gravar
		 	Contato contato = new Contato();
		 	contato.setNome("Caelum");
		 	contato.setEmail("contato@caelum.com.br");
		 	contato.setEndereco("R. Vergueiro 3222 cj33");
		 	contato.setDataNascimento(Calendar.getInstance());
		 	
		 	// grave nessa conexao!!!
		 	ContatoDao dao = new ContatoDao();
		 	
		 	// método 
		 	dao.adiciona(contato);
		 	
		 	System.out.println("Gravado!");
	}
}
