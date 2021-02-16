package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.Solicitud;

public interface IRepository extends JpaRepository<Solicitud, Long> {

}
