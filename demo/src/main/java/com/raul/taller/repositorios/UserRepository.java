package com.raul.taller.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.raul.taller.dtos.UserDTO;
import com.raul.taller.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, String> {
	@Query (value="select new com.raul.taller.dtos.UserDTO (a. id_users, a.username, a.password, a.trabajador, a.nombre, a.apellidos, a.dni, a.email, a.direccion, a.domicilio) "
			+ "FROM com.raul.taller.entities.UserEntity a "
			+ "WHERE (a.username LIKE :username) "
			+ "And (a.password LIKE :password)"
			+ "And (a.trabajador LIKE :trabajador)" )
			
	 List<UserDTO>obtenerUser(
				
				@Param("username")	String username,
				@Param("password") String password,
				@Param("trabajador")Integer trabajador);
				

}
