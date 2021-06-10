package com.raul.taller.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
	
	@Id
	@Column(name = "id_users")
	private Integer id_users;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "enabled")
	private Integer enabled;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "domicilio")
	private String domicilio;
	
	@Column(name = "numero_ruedas")
	private Integer numero_ruedas;
	
	
	

	public UserEntity(Integer id_users, String username, String password, String nombre, String apellidos) {
		super();
		this.id_users = id_users;
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public UserEntity(Integer id_users, String username, String password, Integer enabled, String nombre,
			String apellidos, String dni, String email, String direccion, String domicilio, Integer numero_ruedas) {
		super();
		this.id_users = id_users;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.direccion = direccion;
		this.domicilio = domicilio;
		this.numero_ruedas = numero_ruedas;
	}

	public UserEntity() {
		super();
	}

	public Integer getId_users() {
		return id_users;
	}

	public void setId_users(Integer id_users) {
		this.id_users = id_users;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Integer getNumero_ruedas() {
		return numero_ruedas;
	}

	public void setNumero_ruedas(Integer numero_ruedas) {
		this.numero_ruedas = numero_ruedas;
	}
	
	

}
