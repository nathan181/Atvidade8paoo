package cidaderesource.model.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cidade implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double populacao;
	private Long latitude;
	private Long longitude;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPopulacao() {
		return populacao;
	}
	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}
	public Long getLatitude() {
		return latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}
	public Long getLongitude() {
		return longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}
	
	
	
}
