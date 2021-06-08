package com.raul.taller.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ruedas")
public class RuedaEntity {

	@Id
	@Column(name = "id_ruedas")
	private Integer id_ruedas;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "anchura")
	private Integer anchura;
	
	@Column(name = "perfil")
	private Integer perfil;
	
	@Column(name = "llanta")
	private Integer llanta;
	
	@Column(name = "carga")
	private Integer carga;
	
	@Column(name = "velocidad")
	private String velocidad;
	
	@Column(name = "precio")
	private String precio;
	
	@Column(name = "stock")
	private String stock;

	public RuedaEntity(Integer id_ruedas, String marca, String modelo, Integer anchura, Integer perfil, Integer llanta,
			Integer carga, String velocidad, String precio, String stock) {
		super();
		this.id_ruedas = id_ruedas;
		this.marca = marca;
		this.modelo = modelo;
		this.anchura = anchura;
		this.perfil = perfil;
		this.llanta = llanta;
		this.carga = carga;
		this.velocidad = velocidad;
		this.precio = precio;
		this.stock = stock;
	}
	
	public RuedaEntity(String marca,Integer anchura, Integer perfil, Integer llanta,
			Integer carga, String velocidad) {
		super();
	
		this.marca = marca;
		this.anchura = anchura;
		this.perfil = perfil;
		this.llanta = llanta;
		this.carga = carga;
		this.velocidad = velocidad;
	}

	public RuedaEntity() {
		super();
	}

	public Integer getId_ruedas() {
		return id_ruedas;
	}

	public void setId_ruedas(Integer id_ruedas) {
		this.id_ruedas = id_ruedas;
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

	public Integer getAnchura() {
		return anchura;
	}

	public void setAnchura(Integer anchura) {
		this.anchura = anchura;
	}

	public Integer getPerfil() {
		return perfil;
	}

	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}

	public Integer getLlanta() {
		return llanta;
	}

	public void setLlanta(Integer llanta) {
		this.llanta = llanta;
	}

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
	
	
	
	
}
