package com.example.backend.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mensaje {
	
	public String mensaje;
	
	public Mensaje(String mensaje) {
		this.mensaje = mensaje;
	}


}
