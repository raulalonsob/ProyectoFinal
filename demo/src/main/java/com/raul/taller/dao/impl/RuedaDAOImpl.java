package com.raul.taller.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.raul.taller.daos.RuedaDAO;
import com.raul.taller.dtos.RuedaDTO;
import com.raul.taller.repositorios.RuedaRepository;

public class RuedaDAOImpl implements RuedaDAO{


	
	@Autowired
	private RuedaRepository ruedaRepos;
	


	@Override
	public List<RuedaDTO> obtenerRuedaFiltro(String marca, Integer anchura, Integer perfil, Integer llanta,
			Integer carga, String velocidad) {
		// TODO Auto-generated method stub
		return ruedaRepos.obtenerRuedaFiltro(marca, anchura, perfil, llanta, carga, velocidad);
	}

	
}
