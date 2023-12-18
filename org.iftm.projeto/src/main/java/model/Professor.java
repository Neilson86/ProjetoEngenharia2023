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
public class Professor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_Professor")
	private String idProfessor;
	
	private String nome;
	private String CPF;
	private String Senha;
	// private Integer idCoordenador;

	public Professor(String idProfessor, String nome, String string, String senha) {
		super();
		this.idProfessor = idProfessor;
		this.nome = nome;
		this.CPF = string;
		this.Senha = senha;
	}

	public Professor() {

	}

	public Professor(Object idProfessor2, String nome2, int i, String senha2) {
		// TODO Auto-generated constructor stub
	}

	public String getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(String idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Serializable getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

}
