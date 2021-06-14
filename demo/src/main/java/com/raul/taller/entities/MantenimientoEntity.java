package com.raul.taller.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mantenimientos")
public class MantenimientoEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_mantenimientos")
	private Integer id_mantenimientos;
	
	@Column(name="matricula")
	private String matricula;
	@Column(name="fecha")
	private String fecha;
	@Column(name="kilometros")
	private Integer kilometros;
	@Column(name="cantidad_ruedas")
	private Integer cantidad_ruedas;
	@Column(name="posicion_rueda")
	private String posicion_rueda;
	@Column(name="id_ruedas")
	private Integer id_ruedas;
	@Column(name="importe")
	private String importe;
	
	
	
	public MantenimientoEntity(String matricula, String fecha, Integer kilometros, Integer cantidad_ruedas,
			String posicion_rueda, Integer id_ruedas, String importe) {
		super();
		this.matricula = matricula;
		this.fecha = fecha;
		this.kilometros = kilometros;
		this.cantidad_ruedas = cantidad_ruedas;
		this.posicion_rueda = posicion_rueda;
		this.id_ruedas = id_ruedas;
		this.importe = importe;
	}
	/**
	 * @return the importe
	 */
	public String getImporte() {
		return importe;
	}
	/**
	 * @param importe the importe to set
	 */
	public void setImporte(String importe) {
		this.importe = importe;
	}
	public MantenimientoEntity(String matricula) {
		super();
		this.matricula = matricula;
	}
	/**
	 * 
	 */
	public MantenimientoEntity() {
		super();
	}
	/**
	 * @param id_mantenimientos
	 * @param matricula
	 * @param fecha
	 * @param kilometros
	 * @param candidad_ruedas
	 * @param posicion_rueda
	 * @param id_ruedas
	 */
	public MantenimientoEntity(Integer id_mantenimientos, String matricula, String fecha, Integer kilometros,
			Integer cantidad_ruedas, String posicion_rueda, Integer id_ruedas) {
		super();
		this.id_mantenimientos = id_mantenimientos;
		this.matricula = matricula;
		this.fecha = fecha;
		this.kilometros = kilometros;
		this.cantidad_ruedas = cantidad_ruedas;
		this.posicion_rueda = posicion_rueda;
		this.id_ruedas = id_ruedas;
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
	 * @return the candidad_ruedas
	 */
	public Integer getCantidad_ruedas() {
		return cantidad_ruedas;
	}
	/**
	 * @param candidad_ruedas the candidad_ruedas to set
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
	
	
	

}
