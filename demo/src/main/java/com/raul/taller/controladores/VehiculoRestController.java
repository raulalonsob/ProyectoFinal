package com.raul.taller.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raul.taller.dtos.VehiculoDTO;
import com.raul.taller.entities.VehiculoEntity;
import com.raul.taller.repositorios.VehiculoRepository;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/v1")
public class VehiculoRestController {
	
	@Autowired
	private VehiculoRepository vehiculoRepo;
	
	//Obtener todos los vehiculos
	@GetMapping(value= "/vehiculos")
    public Iterable<VehiculoEntity> listarTodosLosVehiculos(){
        return vehiculoRepo.findAll();
    }
	
	//Obtener vehiculos por id_user para listar todos los vehículos pertenecientes a un usuario
	@GetMapping(value= "/vehiculos", params={"id_users"})
    public List<VehiculoDTO> obtenerVehiculos(
    		@RequestParam("id_users") Integer id_users){
        return vehiculoRepo.obtenerVehiculos(id_users);
    }
}
