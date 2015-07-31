package br.com.jeferson.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Exercicio {

	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	
	private String serie;
	
	private String imagem;

	@ManyToMany
	@JoinTable(
			name="treino_exercicio",
			joinColumns = @JoinColumn(name="id_exercicio"),
			inverseJoinColumns=@JoinColumn(name="id_treino"))
	private List<Treino> treinos;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	

}
