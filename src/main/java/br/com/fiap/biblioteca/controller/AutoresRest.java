package br.com.fiap.biblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.biblioteca.model.AutoresVo;

@Controller
@RequestMapping(value = "/v2/alunos")
public class AutoresRest {

	@GetMapping()
	public List<AutoresVo> obterListAutores() {
		return new ArrayList<>();
	}

	@GetMapping()
	public AutoresVo obterAutorPorChave(@PathParam("cod_autor") Integer cod_autor) {
		AutoresVo autor = delegateObterAutorPorChave(cod_autor);
		return autor;
	}

	@PostMapping
	public void inserirAutor(AutoresVo autor) {
		delegateInsert(autor);
	}

	@PostMapping("/bulk")
	public void inserirAutor(List<AutoresVo> listAutores) {
		for (AutoresVo autor : listAutores) {
			delegateUpdate(autor);
		}
	}

	@PutMapping("/bulk")
	public void alterarAutor(List<AutoresVo> listAutores) {
		for (AutoresVo autor : listAutores) {
			delegateInsert(autor);
		}
	}

	@PutMapping
	public void alterarAutor(AutoresVo autor) {
		delegateUpdate(autor);
	}

	@DeleteMapping
	public void excluirAutor(AutoresVo autor) {
		delegateUpdate(autor);
	}

	public AutoresVo delegateObterAutorPorChave(Integer cod_autor) {
		AutoresVo autor = new AutoresVo(); // aqui vem a consulta na business
		if (autor == null)
			throw new Error("null");
		return autor;
	}

	public void delegateInsert(AutoresVo autor) {
		autor = new AutoresVo(); // aqui vem a operação na business
	}

	public void delegateUpdate(AutoresVo autor) {
		autor = new AutoresVo(); // aqui vem a operação na business
	}

	public void delegateDelete(AutoresVo autor) {
		autor = new AutoresVo(); // aqui vem a operação na business
	}

}
