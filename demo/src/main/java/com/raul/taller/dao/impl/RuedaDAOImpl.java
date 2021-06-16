package com.raul.taller.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.taller.daos.RuedaDAO;
import com.raul.taller.dtos.RuedaDTO;
import com.raul.taller.entities.RuedaEntity;
import com.raul.taller.repositorios.RuedaRepository;
@Service
public class RuedaDAOImpl implements RuedaDAO{


	
	@Autowired
	private RuedaRepository ruedaRepos;
	


	@Override
	public List<RuedaDTO> obtenerRuedaFiltro(String marca, Integer anchura, Integer perfil, Integer llanta,
			Integer carga, String velocidad) {
		// TODO Auto-generated method stub
		return ruedaRepos.obtenerRuedaFiltro(marca, anchura, perfil, llanta, carga, velocidad);
	}

	@Override
	public Boolean insertarRueda(String marca, String modelo, Integer anchura, Integer perfil, Integer llanta,
			Integer carga, String velocidad, String precio) {
		
		RuedaEntity rueda = new RuedaEntity( marca, modelo, anchura,  perfil,  llanta, carga, velocidad,  precio); 
		ruedaRepos.save(rueda);
		return true;
	}
	
}
