package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.Solicitud;

@Repository
public interface IRepository extends JpaRepository<Solicitud, Long> {

//	boolean existsName(String na);
//	boolean existEmail(String ema);
	
}
