package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matricula implements Serializable{
	private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMatricula;
	private String nome;
	private Float nota;
	//private Integer codAluno;
	//private Integer codDisciplina;
	
	public Matricula(Integer idMatricula, String nome, Float nota) {
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
	public Float getNota() {
		return nota;
	}
	public void setNota(Float nota) {
		this.nota = nota;
	}
	
	
}
