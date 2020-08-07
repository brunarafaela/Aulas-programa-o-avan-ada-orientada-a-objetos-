package com.example.demo.model.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue
	 private Long id; 
	 private String modelo;
	 private String marca;
	 private int ano;
	 private String cor;
	 private Double tanque;
	 private Double medida;
	 private Double autonomia;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Double getMedida() {
		return medida;
	}
	public void setMedida(Double medida) {
		this.medida = medida;
	}
	public Double getTanque() {
		return tanque;
	}
	public void setTanque(Double tanque) {
		this.tanque = tanque;
	}
	public Double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(Double autonomia) {
		this.autonomia = autonomia;
	} 
	 
}
