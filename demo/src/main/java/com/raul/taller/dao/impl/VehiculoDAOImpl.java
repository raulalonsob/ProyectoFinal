package com.raul.taller.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.taller.daos.VehiculoDAO;
import com.raul.taller.dtos.VehiculoDTO;
import com.raul.taller.entities.VehiculoEntity;
import com.raul.taller.repositorios.VehiculoRepository;
@Service
public class VehiculoDAOImpl implements VehiculoDAO {
	
	@Autowired
	private VehiculoRepository vehiculoRepos;
	
	@Override
	public List<VehiculoDTO> obtenerVehiculos(Integer id_users) {
		// TODO Auto-generated method stub
		return vehiculoRepos.obtenerVehiculos(id_users);
	}
	
	
	@Override
	public Boolean insertarVehiculos(String matricula, String modelo, Integer id_users) {
		
		VehiculoEntity vehiculo = new VehiculoEntity(matricula, modelo,id_users); 
		vehiculoRepos.save(vehiculo);
		return true;
	}
	

}
