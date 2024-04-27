package com.cibertec.mobdawi2024i.services;

import org.springframework.stereotype.Service;

import com.cibertec.mobdawi2024i.entities.PersonaEntity;
import com.cibertec.mobdawi2024i.repositories.IBaseRepository;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<PersonaEntity, Long> implements IPersonaService {

	public PersonaServiceImpl(IBaseRepository<PersonaEntity, Long> baseRepository) {
		super(baseRepository);
	}
}
