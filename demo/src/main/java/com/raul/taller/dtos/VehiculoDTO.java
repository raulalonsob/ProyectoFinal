package com.raul.taller.dtos;



public class VehiculoDTO {

	private String matricula;
	private String modelo;
	private Integer id_users;
	
	public VehiculoDTO( Integer id_users) {
		
		super();
		this.id_users= id_users;
	}
	
	public VehiculoDTO() {
		super();
	}
	public VehiculoDTO(String matricula, String modelo, Integer id_users) {
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
	
}
