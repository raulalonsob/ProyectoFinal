package com.raul.taller.daos;

import java.util.List;

import com.raul.taller.dtos.VehiculoDTO;

public interface VehiculoDAO {
	
	List<VehiculoDTO> obtenerVehiculos(Integer id_users);
	Boolean insertarVehiculos(String matricula, String modelo, Integer id_users);
}
