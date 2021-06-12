package com.raul.taller.daos;

import java.util.List;

import com.raul.taller.dtos.MantenimientoDTO;
import com.raul.taller.dtos.MantenimientoRequestDTO;

public interface MantenimientoDAO {
	List<MantenimientoRequestDTO> obtenerMantenimiento(String matricula);

}
