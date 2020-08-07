package com.example.demo.model.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue
	 private Long id; //id
	 private String nome; //nome
	 private Double mediaFinal; //media_notas
	private Double nota1;
	private Double nota2;
	
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getMediaFinal() {
		return mediaFinal;
	}
	public void setMediaFinal(Double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
	 
}
