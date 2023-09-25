package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_Professor")
	private Integer idProfessor;
	
	private String nome;
	private Integer CPF;
	private String Senha;
	// private Integer idCoordenador;

	public Professor(Integer idProfessor, String nome, Integer cPF, String senha) {
		super();
		this.idProfessor = idProfessor;
		this.nome = nome;
		CPF = cPF;
		Senha = senha;
	}

	public Professor() {

	}

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
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

	public void setCPF(Integer cPF) {
		CPF = cPF;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

}
