package br.com.jeferson.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.jeferson.dao.CidadeDAO;
import br.com.jeferson.dao.GenericDAO;
import br.com.jeferson.dominio.Cidade;

@ManagedBean
@SessionScoped
public class CidadeMBean {

	private Cidade cidade;
	
	public CidadeMBean() {
		cidade = new Cidade();
	}

	public String cadastrarCidade(){
		
		return"listaCidade"; 
	}
	
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
	
}
