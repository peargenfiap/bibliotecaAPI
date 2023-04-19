package br.com.fiap.businessdelegate.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.biblioteca.model.AutoresVo;

public interface AutoresDAO {

	public abstract List<AutoresVo> obterListAutores() throws SQLException;
	public abstract AutoresVo obterAutorPorChave(Integer cod_autor);
	public abstract void excluirAutor(Integer cod_autor);
	public abstract void incluirAutor(Integer cod_autor);
	public abstract void alterarAutor(Integer cod_autor);

	
}
