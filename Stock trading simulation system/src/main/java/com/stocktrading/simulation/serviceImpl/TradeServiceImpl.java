package com.stocktrading.simulation.serviceImpl;

import com.stocktrading.simulation.entity.Trade;
import com.stocktrading.simulation.repository.TradeRepository;
import com.stocktrading.simulation.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    @Override
    public Trade saveTrade(Trade trade) {
        return tradeRepository.save(trade);
    }

    @Override
    public Trade getTradeById(Long id) {
        return tradeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }

    @Override
    public Trade updateTrade(Long id, Trade trade) {
        Trade existingTrade = tradeRepository.findById(id).orElse(null);
        if (existingTrade != null) {
            existingTrade.setType(trade.getType());
            existingTrade.setQuantity(trade.getQuantity());
            existingTrade.setPrice(trade.getPrice());
            // update other fields as needed
            return tradeRepository.save(existingTrade);
        }
        return null;
    }

    @Override
    public void deleteTrade(Long id) {
        tradeRepository.deleteById(id);
    }
}

