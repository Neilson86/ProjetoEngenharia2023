package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Matricula implements Serializable{
	private static final long serialVersionUID = 1L;
    

	
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_matricula")
	
	private Integer idMatricula;
	private String nome;
	private String nota;
	@ManyToOne
	@JoinColumn(name = "cod_aluno")
	Aluno aluno;
	@ManyToOne
	@JoinColumn(name = "cod_disciplina")
	Disciplina disciplina;
	
	
	//private Integer codDisciplina;
	
	public Matricula(Integer idMatricula, String nome, String nota) {
		super();
		this.idMatricula = idMatricula;
		this.nome = nome;
		this.nota = nota;
	}
	public Matricula() {
		
	}
	public Integer getIdMatricula() {
		return idMatricula;
	}
	public void setIdMatricula(Integer idMatricula) {
		this.idMatricula = idMatricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return String.valueOf(idMatricula);
	}

	
	
}
