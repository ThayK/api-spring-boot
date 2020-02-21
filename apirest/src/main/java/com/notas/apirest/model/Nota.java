package com.notas.apirest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTROLE_NOTAS")
public class Nota implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String matricula;
	private String nomeAluno;
	private Double notaPortugues;
	private Double notaMatematica;
	private Double notaCiencias;
	private Double notaHistoria;
	private Boolean recuperacao;
	private Integer bimestre;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Boolean getRecuperacao() {
		return recuperacao;
	}
	public void setRecuperacao(Boolean recuperacao) {
		this.recuperacao = recuperacao;
	}
	public Integer getBimestre() {
		return bimestre;
	}
	public void setBimestre(Integer bimestre) {
		this.bimestre = bimestre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public Double getNotaPortugues() {
		return notaPortugues;
	}
	public void setNotaPortugues(Double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}
	public Double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(Double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public Double getNotaCiencias() {
		return notaCiencias;
	}
	public void setNotaCiencias(Double notaCiencias) {
		this.notaCiencias = notaCiencias;
	}
	public Double getNotaHistoria() {
		return notaHistoria;
	}
	public void setNotaHistoria(Double notaHistoria) {
		this.notaHistoria = notaHistoria;
	}
	
	
	
	
	
}
