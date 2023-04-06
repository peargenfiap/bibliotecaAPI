package br.com.fiap.biblioteca.model;

import java.util.Date;

public class EmprestimosVo {

	private Integer cod_emprestimo;
	private Date data_emp;
	private Date data_dev;
	private Integer rm;
	private Integer cod_livro;

	public EmprestimosVo() {
	}

	public EmprestimosVo(Integer cod_emprestimo, Date data_emp, Date data_dev, Integer rm, Integer cod_livro) {
		super();
		this.cod_emprestimo = cod_emprestimo;
		this.data_emp = data_emp;
		this.data_dev = data_dev;
		this.rm = rm;
		this.cod_livro = cod_livro;
	}

	public Integer getCod_emprestimo() {
		return cod_emprestimo;
	}

	public void setCod_emprestimo(Integer cod_emprestimo) {
		this.cod_emprestimo = cod_emprestimo;
	}

	public Date getData_emp() {
		return data_emp;
	}

	public void setData_emp(Date data_emp) {
		this.data_emp = data_emp;
	}

	public Date getData_dev() {
		return data_dev;
	}

	public void setData_dev(Date data_dev) {
		this.data_dev = data_dev;
	}

	public Integer getRm() {
		return rm;
	}

	public void setRm(Integer rm) {
		this.rm = rm;
	}

	public Integer getCod_livro() {
		return cod_livro;
	}

	public void setCod_livro(Integer cod_livro) {
		this.cod_livro = cod_livro;
	}

}
