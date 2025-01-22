package com.stocktrading.simulation.repository;

import com.stocktrading.simulation.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    // Define custom query methods if needed
}
