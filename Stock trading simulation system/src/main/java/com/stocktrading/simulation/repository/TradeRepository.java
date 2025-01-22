package com.stocktrading.simulation.repository;

import com.stocktrading.simulation.entity.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
    // Define custom query methods if needed
}
