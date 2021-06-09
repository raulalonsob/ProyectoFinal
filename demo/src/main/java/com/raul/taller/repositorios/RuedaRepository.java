package com.raul.taller.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.raul.taller.dtos.RuedaDTO;
import com.raul.taller.entities.RuedaEntity;

public interface RuedaRepository extends CrudRepository<RuedaEntity, String> {
	@Query(value = "select new com.raul.taller.dtos.RuedaDTO (a.marca,a.modelo, a.anchura, a.perfil, a.llanta, a.carga, a.velocidad, a.precio) "
			+ "FROM com.raul.taller.entities.RuedaEntity a "
			+ "WHERE (a.marca LIKE CONCAT ('%',:marca, '%') or :marca is null) "
			+ "AND (a.anchura LIKE CONCAT ('%',:anchura, '%') or :anchura is null) "
			+ "AND (a.perfil LIKE CONCAT ('%',:perfil, '%' ) or :perfil is null )"
			+ "AND (a.llanta LIKE CONCAT ('%',:llanta, '%') or :llanta is null )"
			+ "AND (a.carga LIKE CONCAT ('%',:carga, '%') or :carga is null )"
			+ "AND (a.velocidad LIKE CONCAT ('%',:velocidad, '%') or :velocidad is null )")
			  List<RuedaDTO>obtenerRuedaFiltro(
								
								@Param("marca")	String marca,
								@Param("anchura")Integer anchura,
								@Param("perfil")Integer perfil,
								@Param("llanta")Integer llanta,
								@Param("carga")	Integer carga,
								@Param("velocidad")String velocidad);
								
}