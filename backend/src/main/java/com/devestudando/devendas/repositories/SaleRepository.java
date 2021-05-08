package com.devestudando.devendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devestudando.devendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
