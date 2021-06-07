package com.raul.taller.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raul.taller.entities.RuedaEntity;
import com.raul.taller.entities.VehiculoEntity;
import com.raul.taller.repositorios.RuedaRepository;
import com.raul.taller.repositorios.VehiculoRepository;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/v1")
public class RuedaRestController {
	
	@Autowired
	private RuedaRepository ruedaRepo;
	@GetMapping(value= "/ruedas")
    public Iterable<RuedaEntity> listarTodas(){
        return ruedaRepo.findAll();
    }
}
