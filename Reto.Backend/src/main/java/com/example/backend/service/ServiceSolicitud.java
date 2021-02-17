package com.example.backend.service;

import com.example.backend.entity.Solicitud;

public interface ServiceSolicitud {

	public Solicitud GuardarSolicitud(Solicitud solicitud);
	boolean existsName(String name);
	boolean existEmail(String email);
}
