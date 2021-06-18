package com.raul.taller.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raul.taller.daos.UserDAO;

import com.raul.taller.dtos.UserDTO;
import com.raul.taller.entities.RuedaEntity;
import com.raul.taller.entities.UserEntity;
import com.raul.taller.repositorios.UserRepository;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/v1")
public class UserRestController {
	
	@Autowired
	private UserRepository userRepos;
	
	@Autowired 
	private UserDAO userDAO;
	
	@GetMapping(value= "/users")
    public Iterable<UserEntity> listarTodas(){
        return userRepos.findAll();
    }
	
	
	// Obtener usuario por usuario y contraseña Login
	@GetMapping(value = "/users", params = {"username","password"})
	public List<UserDTO>obtenerUser(
			@RequestParam(value = "username") String username,
			@RequestParam(value ="password", required = false) String password,
			@RequestParam(value ="trabajador", required = false) Integer trabajador){
			
		return userDAO.obtenerUser(username, password, trabajador);
	}
	
	
	
	@PostMapping("/users")
	public ResponseEntity<?> insertarUser(@RequestBody UserEntity user){
		userRepos.save(user);
		
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

}
