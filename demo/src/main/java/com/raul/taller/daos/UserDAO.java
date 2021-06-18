package com.raul.taller.daos;

import java.util.List;



import com.raul.taller.dtos.UserDTO;

public interface UserDAO {
	
	List<UserDTO>obtenerUser(String username, String password, Integer trabajador);
	Boolean insertarUser(String username, String password, Integer trabajador, String nombre, String apellidos,
			String dni, String email, String direccion, String domicilio);

}
