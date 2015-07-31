package br.com.jeferson.service;

import java.util.List;

import br.com.jeferson.dao.CidadeDAO;
import br.com.jeferson.dao.SimpleEntityManager;
import br.com.jeferson.dominio.Cidade;

public class CidadeService {
	
	private CidadeDAO cidadeDao;
	private SimpleEntityManager simpleEntityManager;
	
	public CidadeService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        cidadeDao = new CidadeDAO(simpleEntityManager.getEntityManager());
    }
	
	public void save(Cidade  obj ){
        try{
            simpleEntityManager.beginTransaction();
            cidadeDao.save(obj);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

	public List<Cidade> findAll(){
		return cidadeDao.findAll();
	}
	 
	public CidadeDAO getCidadeDao() {
		return cidadeDao;
	}

	public void setCidadeDao(CidadeDAO cidadeDao) {
		this.cidadeDao = cidadeDao;
	}

	public SimpleEntityManager getSimpleEntityManager() {
		return simpleEntityManager;
	}

	public void setSimpleEntityManager(SimpleEntityManager simpleEntityManager) {
		this.simpleEntityManager = simpleEntityManager;
	}
	
	
}
