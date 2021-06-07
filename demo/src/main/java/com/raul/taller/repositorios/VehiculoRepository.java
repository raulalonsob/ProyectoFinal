package com.raul.taller.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raul.taller.entities.VehiculoEntity;

@Repository
public interface VehiculoRepository extends CrudRepository<VehiculoEntity, String> {

}
