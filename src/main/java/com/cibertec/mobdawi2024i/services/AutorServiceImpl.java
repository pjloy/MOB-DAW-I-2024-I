package com.cibertec.mobdawi2024i.services;

import org.springframework.stereotype.Service;

import com.cibertec.mobdawi2024i.entities.AutorEntity;
import com.cibertec.mobdawi2024i.repositories.IBaseRepository;

@Service
public class AutorServiceImpl extends BaseServiceImpl<AutorEntity, Long> implements IAutorService {

	public AutorServiceImpl(IBaseRepository<AutorEntity, Long> baseRepository) {
		super(baseRepository); 
	}

}
