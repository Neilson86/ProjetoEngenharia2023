package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDisciplina;
	private String nome;
	private Float horario;
	// private Integer idCurso;
	// private Integer idProfessor;
	// private Integer idCurso;

	public Disciplina(Integer idDisciplina, String nome, Float horario) {
		super();
		this.idDisciplina = idDisciplina;
		this.nome = nome;
		this.horario = horario;
	}

	public Disciplina() {

	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Integer idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getHorario() {
		return horario;
	}

	public void setHorario(Float horario) {
		this.horario = horario;
	}

}
