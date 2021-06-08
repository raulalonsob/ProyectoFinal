package com.raul.taller.daos;

import java.util.List;



import com.raul.taller.dtos.RuedaDTO;

public interface RuedaDAO {
	List<RuedaDTO> obtenerRuedaFiltro(String marca, Integer anchura, Integer perfil, Integer llanta,
			Integer carga, String velocidad);
}
