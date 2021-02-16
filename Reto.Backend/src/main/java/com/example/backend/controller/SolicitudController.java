package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.Solicitud;
import com.example.backend.service.ServiceSolicitud;

@RestController
@RequestMapping("/api/Solicitud")
public class SolicitudController {
	
	@Autowired
	private ServiceSolicitud servicios;
    @PostMapping("/Guardar")
	public ResponseEntity<Solicitud> GuardarSolicitud(Solicitud solicitud){
		servicios.GuardarSolicitud(solicitud);
		return new ResponseEntity("Solicitud Guardada", HttpStatus.CREATED);
	}
	
}
