package com.raul.taller.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.raul.taller.daos.RuedaDAO;
import com.raul.taller.dtos.RuedaDTO;
import com.raul.taller.entities.RuedaEntity;
import com.raul.taller.repositorios.RuedaRepository;
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/v1")
public class RuedaRestController {
	
	@Autowired
	private RuedaRepository ruedaRepo;
	
	@Autowired
	private RuedaDAO ruedaDAO;
	
	
	@GetMapping(value= "/ruedas")
    public Iterable<RuedaEntity> listarTodas(){
        return ruedaRepo.findAll();
    }
	
	@GetMapping(value = "/ruedas", params = {"marca", "anchura", "perfil", "llanta", "carga", "velocidad"})
	public List<RuedaDTO>obtenerRuedaFiltro(
			@RequestParam(value = "marca", required = false) String marca,
			@RequestParam(value ="anchura", required = false) Integer anchura,
			@RequestParam(value ="perfil", required = false) Integer perfil,
			@RequestParam(value ="llanta", required = false) Integer llanta,
			@RequestParam(value ="carga", required = false) Integer carga,
			@RequestParam(value ="velocidad", required = false) String velocidad){
		
		return ruedaDAO.obtenerRuedaFiltro(marca, anchura, perfil, llanta, carga, velocidad);
	}
	
	@PostMapping("/ruedas")
	public ResponseEntity<?> insertarRuedas(@RequestBody RuedaEntity rueda){
		ruedaRepo.save(rueda);
		
		return new ResponseEntity<>(rueda, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/ruedas/{id_ruedas}")
	public ResponseEntity<Integer> BorrarRuedas(@PathVariable("id_ruedas") Integer id_ruedas){
		
		ruedaRepo.deleteById(id_ruedas);
		return new ResponseEntity<>(id_ruedas, HttpStatus.OK);
	}
	
}
