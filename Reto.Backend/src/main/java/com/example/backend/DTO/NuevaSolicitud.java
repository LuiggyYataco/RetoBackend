package com.example.backend.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;



import lombok.Getter;

import lombok.Setter;


@Getter
@Setter
public class NuevaSolicitud {
	
	@NotBlank
	private int post_id;
	@NotBlank
	private String name;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String body;

}
