package com.cibertec.mobdawi2024i.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "domicilio")
public class DomicilioEntity extends BaseEntity{
	private String street;
	private int number;
	
	@ManyToOne
	@JoinColumn(name = "idLocalidad")
	private LocalidadEntity localidad;
}
