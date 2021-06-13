package com.raul.taller.daos;

import java.util.List;



import com.raul.taller.dtos.UserDTO;

public interface UserDAO {
	
	List<UserDTO>obtenerUser(String username, String password, Integer trabajador);

}
