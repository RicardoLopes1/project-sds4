package com.paulolopes.plvendas.repositories;

import com.paulolopes.plvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
