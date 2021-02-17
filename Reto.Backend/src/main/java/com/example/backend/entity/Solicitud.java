package com.example.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Email;
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
	public Solicitud(int post_id, String name, String email, String body) {
		super();
		this.post_id = post_id;
		this.name = name;
		this.email = email;
		this.body = body;
	}

}
