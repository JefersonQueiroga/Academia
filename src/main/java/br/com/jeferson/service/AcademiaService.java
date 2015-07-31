package br.com.jeferson.service;

import java.util.List;

import br.com.jeferson.dao.AcademiaDAO;
import br.com.jeferson.dao.CidadeDAO;
import br.com.jeferson.dao.SimpleEntityManager;
import br.com.jeferson.dominio.Academia;
import br.com.jeferson.dominio.Cidade;

public class AcademiaService {
	
	private AcademiaDAO academiaDAO;
	private SimpleEntityManager simpleEntityManager;
	
	public AcademiaService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        academiaDAO = new AcademiaDAO(simpleEntityManager.getEntityManager());
    }
	
	public void save(Academia  obj ){
        try{
            simpleEntityManager.beginTransaction();
            academiaDAO.save(obj);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

	public List<Academia> findAll(){
		return academiaDAO.findAll();
	}

	public AcademiaDAO getAcademiaDAO() {
		return academiaDAO;
	}

	public void setAcademiaDAO(AcademiaDAO academiaDAO) {
		this.academiaDAO = academiaDAO;
	}

	public SimpleEntityManager getSimpleEntityManager() {
		return simpleEntityManager;
	}

	public void setSimpleEntityManager(SimpleEntityManager simpleEntityManager) {
		this.simpleEntityManager = simpleEntityManager;
	}
	 
	
	
	
}
