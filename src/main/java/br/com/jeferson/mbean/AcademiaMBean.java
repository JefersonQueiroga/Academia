package br.com.jeferson.mbean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.jeferson.dao.SimpleEntityManager;
import br.com.jeferson.dominio.Academia;
import br.com.jeferson.dominio.Cidade;
import br.com.jeferson.service.AcademiaService;
import br.com.jeferson.service.CidadeService;

@ManagedBean
@SessionScoped
public class AcademiaMBean {
	
	String persistenceUnitName = "projetoAcademia";
    
    SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);
	    
	private Academia academia;
	
	private List<Cidade> cidades;
	
	public AcademiaMBean() {
		cidades = new ArrayList<Cidade>();
		academia = new Academia();
		academia.setCidade( new Cidade());
		academia.setDataCadastro(new Date());
	}
	
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}

	
	public String cadastrarCidade(){
		AcademiaService academiaService = new AcademiaService(simpleEntityManager);
		academiaService.save(academia);
		return null;
	}

	public Academia getAcademia() {
		return academia;
	}

	public SimpleEntityManager getSimpleEntityManager() {
		return simpleEntityManager;
	}

	public void setSimpleEntityManager(SimpleEntityManager simpleEntityManager) {
		this.simpleEntityManager = simpleEntityManager;
	}

	public List<Cidade> getCidades() {
		CidadeService cidadeService = new CidadeService(simpleEntityManager);
		return cidadeService.findAll();
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}




	
	
}
