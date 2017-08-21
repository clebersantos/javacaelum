package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import dao.ContatoDao;
import modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.getLista();
		
		for(Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de nascimento: " + 
					new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(contato.getDataNascimento().getTime()) + "\n"
			);
					
		
		}
		
		Contato contato2 = dao.pesquisar(1);
		System.out.println("Nome: " + contato2.getNome());
		System.out.println("Email: " + contato2.getEmail());
		System.out.println("Endereço: " + contato2.getEndereco());
		System.out.println("Data de nascimento: " + 
				new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(contato2.getDataNascimento().getTime()) + "\n"
		);
		
	}
}
