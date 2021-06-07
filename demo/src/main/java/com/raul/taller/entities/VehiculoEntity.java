package com.raul.taller.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculos")
public class VehiculoEntity {

	@Id
	@Column(name = "matricula")
	private String matricula;
	
	@Column(name = "modelo")
	private String modelo;
	
	public VehiculoEntity() {
		super();
	
	}
	
	public VehiculoEntity(String matricula, String modelo, Integer id_users) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.id_users = id_users;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getId_users() {
		return id_users;
	}

	public void setId_users(Integer id_users) {
		this.id_users = id_users;
	}

	@Column(name = "id_users")
	private Integer id_users;
}
