package br.com.fiap.businessdelegate;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.biblioteca.model.AutoresVo;

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
	
	public List<AutoresVo> obterListAutores() {
		return new ArrayList<>();
	}
	//AutoresSessionFacadeLocal autoreSsessionLocal;
	
}
