package br.com.fiap.businessdelegate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.biblioteca.jdbc.adapter.DataAccessObjectAdapter;
import br.com.fiap.biblioteca.model.AutoresVo;

public class AutoresDAOANSI extends DataAccessObjectAdapter implements AutoresDAO {

	private static AutoresDAOANSI instance;

	private AutoresDAOANSI() {}
	
	public static AutoresDAOANSI getInstance() {
		if (instance == null) {
			instance = new AutoresDAOANSI();
		}
		return instance;
	}
	
	@Override
	public List<AutoresVo> obterListAutores() throws SQLException {
		try {
			System.out.println("iniciando metodo: obterListAutores().");

			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;

			List<AutoresVo> result = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("SELECT ");
				sql.append(		"COD_AUTOR, ");
				sql.append(		"NOME, ");
				sql.append(		"SOBRENOME, ");
				sql.append(	"FROM ");
				sql.append(	    "AUTORES ");

				preparedStatement = connection.prepareStatement(sql.toString());
				resultSet = preparedStatement.executeQuery();
				result = new ArrayList<>();

				while (resultSet.next()) {
					AutoresVo vo = new AutoresVo();
					vo.setCod_autor( resultSet.getInt("COD_AUTOR") );
					vo.setNome( resultSet.getString("NOME") );
					vo.setSobrenome( resultSet.getString("SOBRENOME") );
					
					result.add(vo);
				}

				return result;
				
			} catch (SQLException sqle) {
				throw new SQLException(sqle);
			} finally {
				closeResultSet(resultSet);
				closeStatement(preparedStatement);
				closeConnection(connection);
			}
		} finally {
			System.out.println("finalizando metodo: obterListAutores()");
		}
	}
	
	
	@Override
	public AutoresVo obterAutorPorChave(Integer cod_autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluirAutor(Integer cod_autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incluirAutor(Integer cod_autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarAutor(Integer cod_autor) {
		// TODO Auto-generated method stub
		
	}

}
