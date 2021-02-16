package com.example.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Solicitud" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int post_id;
	private String name;
	private String email;
	private String body;

}
