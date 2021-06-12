package com.raul.taller.dtos;

public class MantenimientoRequestDTO {
	
	
	private Integer id_mantenimientos;
	private String matricula;
	private String fecha;
	private Integer kilometros;
	private Integer cantidad_ruedas;
	private String posicion_rueda;
	private Integer id_ruedas;
	private String marca;
	private String modelo;
	
	
	
	
	
	public MantenimientoRequestDTO(Integer id_mantenimientos, String matricula, String fecha, Integer kilometros,
			Integer cantidad_ruedas, String posicion_rueda, Integer id_ruedas, String marca, String modelo) {
		super();
		this.id_mantenimientos = id_mantenimientos;
		this.matricula = matricula;
		this.fecha = fecha;
		this.kilometros = kilometros;
		this.cantidad_ruedas = cantidad_ruedas;
		this.posicion_rueda = posicion_rueda;
		this.id_ruedas = id_ruedas;
		this.marca = marca;
		this.modelo = modelo;
	}
	/**
	 * @return the id_mantenimientos
	 */
	public Integer getId_mantenimientos() {
		return id_mantenimientos;
	}
	/**
	 * @param id_mantenimientos the id_mantenimientos to set
	 */
	public void setId_mantenimientos(Integer id_mantenimientos) {
		this.id_mantenimientos = id_mantenimientos;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the kilometros
	 */
	public Integer getKilometros() {
		return kilometros;
	}
	/**
	 * @param kilometros the kilometros to set
	 */
	public void setKilometros(Integer kilometros) {
		this.kilometros = kilometros;
	}
	/**
	 * @return the cantidad_ruedas
	 */
	public Integer getCantidad_ruedas() {
		return cantidad_ruedas;
	}
	/**
	 * @param cantidad_ruedas the cantidad_ruedas to set
	 */
	public void setCantidad_ruedas(Integer cantidad_ruedas) {
		this.cantidad_ruedas = cantidad_ruedas;
	}
	/**
	 * @return the posicion_rueda
	 */
	public String getPosicion_rueda() {
		return posicion_rueda;
	}
	/**
	 * @param posicion_rueda the posicion_rueda to set
	 */
	public void setPosicion_rueda(String posicion_rueda) {
		this.posicion_rueda = posicion_rueda;
	}
	/**
	 * @return the id_ruedas
	 */
	public Integer getId_ruedas() {
		return id_ruedas;
	}
	/**
	 * @param id_ruedas the id_ruedas to set
	 */
	public void setId_ruedas(Integer id_ruedas) {
		this.id_ruedas = id_ruedas;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
