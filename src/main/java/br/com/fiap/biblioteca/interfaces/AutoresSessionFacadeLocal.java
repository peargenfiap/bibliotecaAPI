package br.com.fiap.biblioteca.interfaces;

import java.util.List;

import br.com.fiap.biblioteca.model.AutoresVo;

public interface AutoresSessionFacadeLocal {

	public abstract List<AutoresVo> obterListaAutres();
	
}
