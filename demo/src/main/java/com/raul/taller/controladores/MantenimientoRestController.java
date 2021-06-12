package com.raul.taller.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.raul.taller.dtos.MantenimientoDTO;
import com.raul.taller.dtos.MantenimientoRequestDTO;
import com.raul.taller.repositorios.MantenimientoRepository;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/v1")
public class MantenimientoRestController {
	@Autowired
	private MantenimientoRepository mantRepo;
	

	
	@GetMapping(value= "/mantenimiento", params={"matricula"})
    public List<MantenimientoRequestDTO> obtenerMantenimiento(
    		@RequestParam(value="matricula") String matricula){
        return mantRepo.obtenerMantenimiento(matricula);
    }
}
