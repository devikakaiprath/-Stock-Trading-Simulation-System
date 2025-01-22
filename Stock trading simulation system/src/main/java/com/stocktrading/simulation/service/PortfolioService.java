package com.stocktrading.simulation.service;

import com.stocktrading.simulation.entity.Portfolio;
import java.util.List;
import java.util.Optional;

public interface PortfolioService {
    Portfolio savePortfolio(Portfolio portfolio);
    Optional<Portfolio> getPortfolioById(Long id);
    List<Portfolio> getAllPortfolios();
    Portfolio updatePortfolio(Long id, Portfolio portfolio);
    void deletePortfolio(Long id);
}
