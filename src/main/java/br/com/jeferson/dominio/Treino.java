package br.com.jeferson.dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Treino {
	
	@Id
	@GeneratedValue
	private long idTreino;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFim;
	
	@ManyToOne
	@JoinColumn(name="id_pessoa")
	private Pessoa pessoa;
	
	@ManyToMany
	@JoinTable(
			name="treino_exercicio",
			joinColumns = @JoinColumn(name="id_treino"),
			inverseJoinColumns=@JoinColumn(name="id_exercicio"))
	private List<Exercicio> exercicios;
	
	private String observacao;

	public long getIdTreino() {
		return idTreino;
	}

	public void setIdTreino(long idTreino) {
		this.idTreino = idTreino;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
	
	
	
	
}
