package br.com.fiap.businessdelegate;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.biblioteca.model.AutoresVo;
import br.com.fiap.businessdelegate.dao.AutoresDAOANSI;

public class AutoresBusinessDelegate {

	private static AutoresBusinessDelegate instance;

	private AutoresBusinessDelegate() {}
	
	public static AutoresBusinessDelegate getInstance() {
		if (instance == null) {
			instance = new AutoresBusinessDelegate();
		}
		synchronized (instance) {
			return instance;
		}
	}
	
	public List<AutoresVo> obterListAutores() throws SQLException {
		return AutoresDAOANSI.getInstance().obterListAutores();
	}
	
}
