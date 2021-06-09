package com.raul.taller.dtos;



public class RuedaDTO {

	private Integer id_ruedas;
	private String marca;
	private String modelo;
	private Integer anchura;
	private Integer perfil;
	private Integer llanta;
	private Integer carga;
	private String velocidad;
	private String precio;
	private String stock;
	
	
	
	
	public RuedaDTO(String marca, String modelo, Integer anchura, Integer perfil, Integer llanta, Integer carga, String velocidad, String precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anchura = anchura;
		this.perfil = perfil;
		this.llanta = llanta;
		this.carga = carga;
		this.velocidad = velocidad;
		this.precio= precio;
	}
	public RuedaDTO() {
		super();
	}
	public RuedaDTO(Integer id_ruedas, String marca, String modelo, Integer anchura, Integer perfil, Integer llanta,
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
