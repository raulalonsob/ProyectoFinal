package com.raul.taller.dtos;

public class UserDTO {
	
	

	private Integer id_users;
	private String username;
	private String password;
	private Integer trabajador;
	private String nombre;
	private String apellidos;
	private String dni;
	
	
	
	public UserDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public UserDTO(Integer id_users, String username, String password, String nombre, String apellidos) {
		super();
		this.id_users = id_users;
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public UserDTO() {
		super();
	}
	public UserDTO(Integer id_users, String username, String password, Integer trabajador, String nombre, String apellidos,
			String dni, String email, String direccion, String domicilio, Integer numero_ruedas) {
		super();
		this.id_users = id_users;
		this.username = username;
		this.password = password;
		this.trabajador = trabajador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.direccion = direccion;
		this.domicilio = domicilio;
		this.numero_ruedas = numero_ruedas;
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
	public Integer getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Integer trabajador) {
		this.trabajador = trabajador;
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
	private String email;
	private String direccion;
	private String domicilio;
	private Integer numero_ruedas;

}
