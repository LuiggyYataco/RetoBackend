package com.example.backend.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.backend.util.constraint;


import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.DTO.Mensaje;
import com.example.backend.entity.Solicitud;
import com.example.backend.service.ServiceSolicitud;
import com.example.backend.service.impl.ServiceSolicitudImpl;
import com.example.backend.DTO.*;
@RestController
@RequestMapping("/api/Solicitud")
public class SolicitudController {
	
	@Autowired
	private ServiceSolicitudImpl servicesolicitud;
   
	
	
//	@PostMapping("/Guardar")
//	public ResponseEntity<Solicitud> GuardarSolicitud(@RequestBody Solicitud solicitud){
//    	servicesolicitud.GuardarSolicitud(solicitud);
//    	return new ResponseEntity("Solicitud Generada Correctamente", HttpStatus.CREATED);
//	}
	
	@PostMapping("/Guardar")
	  public ResponseEntity<?> crear(@Valid @RequestBody Solicitud nuevasolicitud){
	
//		if(bindingResult.hasErrors())
//	            return new ResponseEntity( new Mensaje("adsasdasd"),HttpStatus.BAD_REQUEST);
//	    if(servicesolicitud.existsName(nuevasolicitud.getName()))
//	            return new ResponseEntity(new Mensaje("el name se repite"),HttpStatus.BAD_GATEWAY);
//	    if(servicesolicitud.existEmail(nuevasolicitud.getEmail()))
//	        	   return new ResponseEntity(new Mensaje("el email se repite"),HttpStatus.BAD_GATEWAY);
//	           
//	           Solicitud solicitudes = new Solicitud(nuevasolicitud.getPost_id(),nuevasolicitud.getName(),nuevasolicitud.getEmail(),nuevasolicitud.getBody());   
//	        	servicesolicitud.GuardarSolicitud(solicitudes);
	            return new ResponseEntity( new Mensaje(constraint.MENSAJE_SUCCESS), HttpStatus.CREATED);
	        
	    }
	
}
