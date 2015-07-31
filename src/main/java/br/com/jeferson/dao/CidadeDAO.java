package br.com.jeferson.dao;

import javax.persistence.EntityManager;

import br.com.jeferson.dominio.Cidade;

public class CidadeDAO extends GenericDAO<Long, Cidade> {

	public CidadeDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
