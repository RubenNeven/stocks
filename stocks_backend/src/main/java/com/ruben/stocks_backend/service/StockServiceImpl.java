package com.ruben.stocks_backend.service;

import com.ruben.stocks_backend.entity.Stock;
import com.ruben.stocks_backend.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {

    private final StockRepository stockRepository;

    @Autowired
    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Stock save(Stock stock) {
        stockRepository.save(stock);
        return stock;
    }
}
