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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.raul.taller.daos.MantenimientoDAO;
import com.raul.taller.dtos.MantenimientoDTO;
import com.raul.taller.dtos.MantenimientoRequestDTO;
import com.raul.taller.negocio.ICalcularPrecio;
import com.raul.taller.repositorios.MantenimientoRepository;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/v1")
public class MantenimientoRestController {
	@Autowired
	private MantenimientoRepository mantRepo;
	
	
	@Autowired
	ICalcularPrecio iCalcular;
	@Autowired
	private MantenimientoDAO mantDAO;
	
	@GetMapping(value= "/mantenimiento", params={"matricula"})
    public List<MantenimientoRequestDTO> obtenerMantenimiento(
    		@RequestParam(value="matricula") String matricula){
        return mantRepo.obtenerMantenimiento(matricula);
    }
	
	

	
	@PostMapping(value = "/mantenimiento")
    public ResponseEntity<?> insertarMantenimiento(@RequestBody MantenimientoDTO mantenimiento){
		
		mantenimiento.setImporte(iCalcular.calcularPrecioMantenimiento(mantenimiento.getCantidad_ruedas(), mantenimiento.getId_ruedas()));
        
		if(mantDAO.obtenerMant(mantenimiento)) {
            return new ResponseEntity<>(mantenimiento, HttpStatus.OK);
        }else {
            return null;
        }
		
    }
	
}
