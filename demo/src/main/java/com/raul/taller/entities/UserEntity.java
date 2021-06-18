

package com.raul.taller.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_users")
	private Integer id_users;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "trabajador")
	private Integer trabajador;
	
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
	

	
	

	public UserEntity(String username, String password, Integer trabajador, String nombre, String apellidos, String dni,
			String email, String direccion, String domicilio) {
		super();
		this.username = username;
		this.password = password;
		this.trabajador = trabajador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.direccion = direccion;
		this.domicilio = domicilio;
	}

	public UserEntity(Integer id_users, String username, String password, String nombre, String apellidos) {
		super();
		this.id_users = id_users;
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public UserEntity(Integer id_users, String username, String password, Integer trabajador, String nombre,
			String apellidos, String dni, String email, String direccion, String domicilio) {
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

	
	

}
