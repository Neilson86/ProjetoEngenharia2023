package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCurso;
	private String nome;
	private Float cargaHoraria;
	//private Integer idCoordenador;
	
	public Curso(Integer idCurso, String nome, Float cargaHoraria) {
		super();
		this.idCurso = idCurso;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Curso() {
	
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Float cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
