package com.keycloak.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keycloak.service.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	
}
