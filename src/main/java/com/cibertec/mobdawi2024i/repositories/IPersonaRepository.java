package com.cibertec.mobdawi2024i.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cibertec.mobdawi2024i.entities.PersonaEntity;

@Repository
public interface IPersonaRepository extends IBaseRepository<PersonaEntity, Long> {
	
	// Query Method
	// RQ: Busqueda de la persona por nombre o apellido (fragmento)
	List<PersonaEntity> findByNameContainingOrLastnameContaining (String name, String lastname);
	
	// Query JPQL
	
	
	
	// Query con SQL Nativo
	
}
