package br.com.fiap.biblioteca.model;

import java.io.Serializable;

public class LivrosVo implements Serializable {

	private Integer cod_livro;
	private String titilo;
	private Integer cod_autor;
	
	public LivrosVo() {
		
	}

	public LivrosVo(Integer cod_livro, String titilo, Integer cod_autor) {
		super();
		this.cod_livro = cod_livro;
		this.titilo = titilo;
		this.cod_autor = cod_autor;
	}

	public Integer getCod_livro() {
		return cod_livro;
	}

	public void setCod_livro(Integer cod_livro) {
		this.cod_livro = cod_livro;
	}

	public String getTitilo() {
		return titilo;
	}

	public void setTitilo(String titilo) {
		this.titilo = titilo;
	}

	public Integer getCod_autor() {
		return cod_autor;
	}

	public void setCod_autor(Integer cod_autor) {
		this.cod_autor = cod_autor;
	}

}
