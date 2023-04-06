package br.com.fiap.biblioteca.model;

import java.io.Serializable;
import java.util.Date;

public class EmprestimosVo implements Serializable {

	private Integer rm;
	private String nome;
	private String sobrenome;
	private Date dt_nasc;

	public EmprestimosVo() {
	}

	public EmprestimosVo(Integer rm, String nome, String sobrenome, Date dt_nasc) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dt_nasc = dt_nasc;
	}

	public Integer getRm() {
		return rm;
	}

	public void setRm(Integer rm) {
		this.rm = rm;
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

	public Date getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(Date dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

}
