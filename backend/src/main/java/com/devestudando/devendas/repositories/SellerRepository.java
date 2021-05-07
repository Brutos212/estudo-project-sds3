package com.devestudando.devendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devestudando.devendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
