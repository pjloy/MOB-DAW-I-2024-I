package com.cibertec.mobdawi2024i.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autor")
public class AutorEntity extends BaseEntity {
	
	private String name;
	@Column(name = "lastname")
	private String lastName;
}
