package com.cibertec.mobdawi2024i.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "localidad")
public class LocalidadEntity extends BaseEntity{
	private String name;	
}
