package com.raul.taller.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.taller.repositorios.RuedaRepository;

@Service
public class CalcularPrecioImpl implements ICalcularPrecio {
	@Autowired
	RuedaRepository ruedaRepo;

	@Override
	public String calcularPrecioMantenimiento(Integer num_ruedas, Integer id_rueda) {
		String precio = ruedaRepo.findById(id_rueda).get().getPrecio();
		
		Double precioTotal = Double.parseDouble(precio)*num_ruedas;
		
		
		return String.valueOf(precioTotal);
	}


	


	
	


}
