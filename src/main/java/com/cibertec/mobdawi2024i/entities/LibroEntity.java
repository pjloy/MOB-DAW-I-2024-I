package com.cibertec.mobdawi2024i.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libro")
public class LibroEntity extends BaseEntity{
	private String name;
	private String genre;
	private int pages;
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	List<AutorEntity> autores;

}
