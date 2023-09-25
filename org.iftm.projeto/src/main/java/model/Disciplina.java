package model;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_Disciplina")
	
	private Integer idDisciplina;
	private String nome;
	private Time horario;
	// private Integer idCurso;
	// private Integer idProfessor;
	// private Integer idCurso;

	public Disciplina(Integer idDisciplina, String nome, Time horario) {
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

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

}
