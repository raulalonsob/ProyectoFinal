package com.raul.taller.daos;

import java.util.List;



import com.raul.taller.dtos.RuedaDTO;

public interface RuedaDAO {
	List<RuedaDTO> obtenerRuedaFiltro(String marca, Integer anchura, Integer perfil, Integer llanta,
			Integer carga, String velocidad);
	
	Boolean insertarRueda(String marca, String modelo, Integer anchura, Integer perfil, Integer llanta,
			Integer carga, String velocidad, String precio);
	
	Integer eliminarRueda(Integer id);
}
