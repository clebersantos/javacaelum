package br.com.caelum.jdbc.teste;

import java.util.List;

import dao.FuncionarioDAO;
import modelo.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Cleber Santos");
		funcionario.setUsuario("clebersantos");
		funcionario.setSenha("132456");
		
//		dao.adicionar(funcionario);
		
	 List<Funcionario> funcionarios = dao.getLista();
	 
	 for (Funcionario func : funcionarios) {
		 System.out.println("ID: " + func.getId());
		 System.out.println("Nome: " + func.getNome());
		 System.out.println("Usuario: " + func.getUsuario());
		 System.out.println("Senha: " + func.getSenha());
	 }

	}

}
