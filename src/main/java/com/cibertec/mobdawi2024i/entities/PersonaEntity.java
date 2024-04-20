package com.cibertec.mobdawi2024i.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persona")
public class PersonaEntity extends BaseEntity{
	
	private String name;
	private String lastname;
	private String DNI;
	
	@OneToOne(cascade = CascadeType.ALL)
	private DomicilioEntity domicilio;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name = "persona_libro", 
		joinColumns = @JoinColumn(name = "persona_id"),
		inverseJoinColumns = @JoinColumn(name = "libro_id"))	
	List<LibroEntity> libros = new ArrayList<LibroEntity>();
	

}
