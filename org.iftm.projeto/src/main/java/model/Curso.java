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
import org.hibernate.annotations.ForeignKey;

@Entity
public class Curso implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_curso")
	
	private Integer idCurso;
	private String nome;
	@Column(name="carga_horaria")
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

	//método que imprime o objeto,gera um texto para isso
	@Override
	public String toString() {
		return idCurso + "-" + nome;
	}
	
	
}
