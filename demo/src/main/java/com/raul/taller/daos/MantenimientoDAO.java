package com.raul.taller.daos;

import java.util.List;

import com.raul.taller.dtos.MantenimientoDTO;

public interface MantenimientoDAO {
	List<MantenimientoDTO> obtenerMantenimiento(String matricula);

}
