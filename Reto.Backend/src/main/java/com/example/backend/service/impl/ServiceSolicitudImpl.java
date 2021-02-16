package com.example.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.Solicitud;
import com.example.backend.repository.IRepository;
import com.example.backend.service.ServiceSolicitud;

@Service
public class ServiceSolicitudImpl implements ServiceSolicitud {
    @Autowired 
    private IRepository repositorio;
	@Override
	public void GuardarSolicitud(Solicitud solicitud) {
		// TODO Auto-generated method stub
	repositorio.save(solicitud);
	
	}

}
