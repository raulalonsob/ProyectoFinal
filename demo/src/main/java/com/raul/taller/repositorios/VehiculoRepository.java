package com.raul.taller.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.raul.taller.dtos.VehiculoDTO;
import com.raul.taller.entities.VehiculoEntity;

@Repository
public interface VehiculoRepository extends CrudRepository<VehiculoEntity, String> {
	@Query (value="select new com.raul.taller.dtos.VehiculoDTO (a. matricula, a.modelo, a.id_users) "
			+ "FROM com.raul.taller.entities.VehiculoEntity a "
			+ "WHERE (a.id_users = :id_users) ")
			
	 List<VehiculoDTO>obtenerVehiculos(
				
				@Param("id_users")	Integer id_users);
				


}
