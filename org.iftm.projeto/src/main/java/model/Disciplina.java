package model;

import java.io.Serializable;
import java.sql.Time;
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
import org.hibernate.annotations.ForeignKey;

@Entity
public class Disciplina implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_Disciplina")
	
	private Integer idDisciplina;
	private String nome;
	private Time horario;
	
	@OneToMany(mappedBy = "disciplina")
    private List<Matricula> matriculas;
	
	
	// private Integer idCurso;
	// private Integer idProfessor;
	// private Integer idCurso;



	public Disciplina() {

	}

	public Disciplina(Integer idDisciplina, String nome, Time horario, List<Matricula> matriculas) {
		super();
		this.idDisciplina = idDisciplina;
		this.nome = nome;
		this.horario = horario;
		this.matriculas = matriculas;
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

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	

}
