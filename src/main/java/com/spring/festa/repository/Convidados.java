package com.spring.festa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.festa.model.Convidado;

@Repository
public class Convidados {

	private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();

	static {
		LISTA_CONVIDADOS.add(new Convidado(1L, "Linara", 2));
		LISTA_CONVIDADOS.add(new Convidado(2L, "Ivina", 1));
		LISTA_CONVIDADOS.add(new Convidado(3L, "Júlio", 3));
	}

	public List<Convidado> todos() {
		return Convidados.LISTA_CONVIDADOS;
	}

	public void adicionar(Convidado convidado) {
		Convidados.LISTA_CONVIDADOS.add(convidado);
	}

	public void deletaPeloId(Long id) {
		for (Convidado convidado : LISTA_CONVIDADOS) {
			if (id == convidado.getId()) {
				LISTA_CONVIDADOS.remove(convidado);
				break;
			}
		}
	}

}
