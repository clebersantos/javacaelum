package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import modelo.Funcionario;

public class FuncionarioDAO {
	private Connection connection;

	public FuncionarioDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adicionar(Funcionario funcionario) {

		String sql = "insert into funcionarios " + "(nome, usuario, senha)" + " value (?, ?, ?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (DAOException e) {
			throw new DAOException(1, e.getMessage());
		}

	}

	public List<Funcionario> getLista() {

		try {
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from funcionarios");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getLong("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setUsuario(rs.getString("usuario"));
				funcionario.setSenha(rs.getString("senha"));

				funcionarios.add(funcionario);
			}
			rs.close();
			stmt.close();

			return funcionarios;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	public Funcionario pesquisar(int id) {
		
		String sql = "select * from funcionarios where id = ?";
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			
			Funcionario funcionario = new Funcionario();
			funcionario.setId(rs.getLong("id"));
			funcionario.setNome(rs.getString("nome"));
			funcionario.setUsuario(rs.getString("usuario"));
			funcionario.setSenha(rs.getString("senha"));
			
			rs.close();
			stmt.close();
			
			return funcionario;
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
