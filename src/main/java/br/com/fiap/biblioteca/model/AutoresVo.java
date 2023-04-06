package br.com.fiap.biblioteca.model;

import java.io.Serializable;

public class AutoresVo implements Serializable {

	private Integer cod_autor;
	private String nome;
	private String sobrenome;

	public AutoresVo() {
	}

	public AutoresVo(Integer cod_autor, String nome, String sobrenome) {
		super();
		this.cod_autor = cod_autor;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Integer getCod_autor() {
		return cod_autor;
	}

	public void setCod_autor(Integer cod_autor) {
		this.cod_autor = cod_autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
