package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Coordenador implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_coordenador")
	
	private Integer idCoordenador;
	private String nome;
	private Integer CPF;
	private String Senha;
	//private idCurso;
  
	public Coordenador(Integer idCoordenador, String nome, Integer cPF, String senha) {
		super();
		this.idCoordenador = idCoordenador;
		this.nome = nome;
		CPF = cPF;
		Senha = senha;
	}
	public Coordenador() {
	
	}
	public Integer getIdCoordenador() {
		return idCoordenador;
	}
	public void setIdCoordenador(Integer idCoordenador) {
		this.idCoordenador = idCoordenador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
  
}
