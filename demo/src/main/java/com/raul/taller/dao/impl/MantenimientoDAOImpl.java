package com.raul.taller.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.taller.daos.MantenimientoDAO;
import com.raul.taller.dtos.MantenimientoDTO;
import com.raul.taller.dtos.MantenimientoRequestDTO;
import com.raul.taller.dtos.RuedaDTO;
import com.raul.taller.repositorios.MantenimientoRepository;

@Service
public class MantenimientoDAOImpl implements MantenimientoDAO {
	
	@Autowired
	private MantenimientoRepository mantRepo;
	
	
	@Override
	public List<MantenimientoRequestDTO> obtenerMantenimiento(String matricula) {
		
		return mantRepo.obtenerMantenimiento(matricula);
	}

}
