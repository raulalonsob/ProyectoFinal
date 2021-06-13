package com.raul.taller.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.taller.daos.UserDAO;
import com.raul.taller.dtos.UserDTO;
import com.raul.taller.repositorios.UserRepository;

@Service
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<UserDTO>obtenerUser(String username, String password, Integer trabajador){
		return userRepo.obtenerUser(username, password, trabajador);
	}
}


