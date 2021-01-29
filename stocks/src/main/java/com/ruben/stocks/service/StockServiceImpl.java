package com.ruben.stocks.service;

import com.ruben.stocks.controller.dto.StockDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {

    private final StockFeignClient stockFeignClient;

    @Autowired
    public StockServiceImpl(StockFeignClient stockFeignClient) {
        this.stockFeignClient = stockFeignClient;
    }

    @Override
    public void save(StockDto stockDto) {
        stockFeignClient.addStock(stockDto);
    }
}
