package com.raul.taller.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.taller.daos.MantenimientoDAO;
import com.raul.taller.dtos.MantenimientoDTO;
import com.raul.taller.dtos.MantenimientoRequestDTO;
import com.raul.taller.dtos.RuedaDTO;
import com.raul.taller.entities.MantenimientoEntity;
import com.raul.taller.repositorios.MantenimientoRepository;

@Service
public class MantenimientoDAOImpl implements MantenimientoDAO {
	
	@Autowired
	private MantenimientoRepository mantRepo;
	
	
	@Override
	public List<MantenimientoRequestDTO> obtenerMantenimiento(String matricula) {
		
		return mantRepo.obtenerMantenimiento(matricula);
	}


	@Override
	public Boolean obtenerMant(MantenimientoDTO mantenimiento) {

		MantenimientoEntity nuevoMantenimiento=new MantenimientoEntity(mantenimiento.getMatricula(), mantenimiento.getFecha(), mantenimiento.getKilometros(),mantenimiento.getCantidad_ruedas(),mantenimiento.getPosicion_rueda(),mantenimiento.getId_ruedas(),mantenimiento.getImporte());
		mantRepo.save(nuevoMantenimiento);
		
		return true;
	}
	

}
