package com.raul.taller.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.raul.taller.dtos.MantenimientoDTO;
import com.raul.taller.entities.MantenimientoEntity;

@Repository
public interface MantenimientoRepository extends CrudRepository<MantenimientoEntity, String> {
	@Query(value = "select new com.raul.taller.dtos.MantenimientoDTO (a.id_mantenimientos, a.matricula, a.fecha, a.kilometros, a.cantidad_ruedas, a.posicion_rueda, a.id_ruedas) "
			+ "FROM com.raul.taller.entities.MantenimientoEntity a "
			+ "WHERE (a.matricula like :matricula) ")
			  List<MantenimientoDTO>obtenerMantenimiento(
								
								@Param("matricula")	String matricula);
								
}

//, r.id_ruedas
//JOIN com.raul.taller.entities.RuedaEntity r ON a.id_ruedas = r.id_ruedas