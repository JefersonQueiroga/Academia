package br.com.jeferson.dao;

import javax.persistence.EntityManager;

import br.com.jeferson.dominio.Academia;

public class AcademiaDAO  extends GenericDAO<Long, Academia>{

	public AcademiaDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
