package com.cibertec.mobdawi2024i.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.cibertec.mobdawi2024i.entities.BaseEntity;

@NoRepositoryBean
public interface IBaseRepository <E extends BaseEntity, ID extends Serializable> extends JpaRepository<E, ID>{

}
