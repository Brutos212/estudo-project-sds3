package com.devestudando.devendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devestudando.devendas.dto.SaleSuccessDTO;
import com.devestudando.devendas.dto.SaleSumDTO;
import com.devestudando.devendas.entities.Sale;



public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.devestudando.devendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))  "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.devestudando.devendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))  "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> sucessGroupedBySeller();

}
