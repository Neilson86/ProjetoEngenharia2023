package model;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_aluno")	
	private String codAluno;
	private String nome;
	private String cpf;
	private String email;
	
	@Column(name="data_nasc")
	private Instant dataNascimento;
	private String matricula;
	
	public Aluno(String nome, String cpf, String email, Instant dataNascimento, String matricula) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
	}

	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		email = email;
	}

	public Instant getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Instant dataNascimento) {
		dataNascimento = dataNascimento;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setDataMatricula(String dataMatricula) {
		matricula = matricula;
	}

}
