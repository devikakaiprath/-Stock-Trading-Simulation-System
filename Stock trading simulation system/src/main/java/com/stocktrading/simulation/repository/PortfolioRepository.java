package com.stocktrading.simulation.repository;

import com.stocktrading.simulation.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    // Define custom query methods if needed
}
