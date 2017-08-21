package modelo;

import java.util.Calendar;

public class Contato {
	
	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novo) {
		this.nome = novo;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String novo) {
		this.email = novo;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Calendar getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
