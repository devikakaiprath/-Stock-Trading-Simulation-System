package com.stocktrading.simulation.service;

import com.stocktrading.simulation.entity.Trade;
import java.util.List;

public interface TradeService {
    Trade saveTrade(Trade trade);
    Trade getTradeById(Long id);
    List<Trade> getAllTrades();
    Trade updateTrade(Long id, Trade trade);
    void deleteTrade(Long id);
}
