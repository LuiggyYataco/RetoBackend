package com.example.backend.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.Solicitud;
import com.example.backend.repository.IRepository;


@Service
@Transactional
public class ServiceSolicitudImpl {
    @Autowired 
    private IRepository repositorio;
	
	public Solicitud GuardarSolicitud(Solicitud solicitud) {
		// TODO Auto-generated method stub
	return repositorio.save(solicitud);
	
	}
	
//	public boolean existsName(String name) {
//		// TODO Auto-generated method stub
//		return repositorio.existsName(name) ;
//	}
//	
//	public boolean existEmail(String email) {
//		return repositorio.existEmail(email);
//	}

}
