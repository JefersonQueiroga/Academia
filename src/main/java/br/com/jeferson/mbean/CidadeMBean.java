package br.com.jeferson.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.jeferson.dao.SimpleEntityManager;
import br.com.jeferson.dominio.Cidade;
import br.com.jeferson.service.CidadeService;

@ManagedBean
@SessionScoped
public class CidadeMBean {
	
	String persistenceUnitName = "projetoAcademia";
     
    SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);
	
    private Cidade cidade;
	
	public CidadeMBean() {
		cidade = new Cidade();
	}

	public String cadastrarCidade(){
		System.out.println("TEstando");
		CidadeService cidadeService = new CidadeService(simpleEntityManager);	
		cidadeService.save(cidade);
		return"listaCidade"; 
	}
	
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
	
}
