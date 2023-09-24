package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alunos implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String nome;
	private Integer CPF;
	private String Email;
	private Integer DataNascimento;
	private Integer DataMatricula;

	public Alunos(String nome, Integer cPF, String email, Integer dataNascimento, Integer dataMatricula) {
		super();
		this.nome = nome;
		CPF = cPF;
		Email = email;
		DataNascimento = dataNascimento;
		DataMatricula = dataMatricula;
	}

	public Alunos() {
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(Integer dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public int getDataMatricula() {
		return DataMatricula;
	}

	public void setDataMatricula(Integer dataMatricula) {
		DataMatricula = dataMatricula;
	}

}
