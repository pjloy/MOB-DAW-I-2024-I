package com.cibertec.mobdawi2024i.services;

import org.springframework.stereotype.Service;

import com.cibertec.mobdawi2024i.entities.LocalidadEntity;
import com.cibertec.mobdawi2024i.repositories.IBaseRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<LocalidadEntity, Long> implements ILocalidadService{

	public LocalidadServiceImpl(IBaseRepository<LocalidadEntity, Long> baseRepository) {
		super(baseRepository);		
	}

}
