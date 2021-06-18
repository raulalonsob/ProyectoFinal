package com.raul.taller.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.taller.daos.UserDAO;
import com.raul.taller.dtos.UserDTO;
import com.raul.taller.entities.UserEntity;
import com.raul.taller.repositorios.UserRepository;

@Service
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<UserDTO>obtenerUser(String username, String password, Integer trabajador){
		return userRepo.obtenerUser(username, password, trabajador);
	}
	
	@Override
	public Boolean insertarUser(String username, String password, Integer trabajador, String nombre, String apellidos,
			String dni, String email, String direccion, String domicilio) {
		
		UserEntity user = new UserEntity(username, password, trabajador, nombre,apellidos,dni,email,direccion,domicilio); 
		userRepo.save(user);
		return true;
	}
	
}


