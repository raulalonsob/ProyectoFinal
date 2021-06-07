package com.raul.taller.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raul.taller.entities.VehiculoEntity;
import com.raul.taller.repositorios.VehiculoRepository;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/v1")
public class PruebaRestController {
	
	@Autowired
	private VehiculoRepository vehiculoRepo;
	@GetMapping(value= "/vehiculos")
    public Iterable<VehiculoEntity> listarTodosLosProyectos(){
        return vehiculoRepo.findAll();
    }
}
