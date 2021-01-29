package com.ruben.stocks_backend.controller;

import com.ruben.stocks_backend.entity.Stock;
import com.ruben.stocks_backend.models.StockDto;
import com.ruben.stocks_backend.service.StockService;
import com.ruben.stocks_backend.service.utilities.StockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    private final StockService stockService;
    private final StockMapper stockMapper;

    @Autowired
    public StockController(StockService stockService, StockMapper stockMapper) {
        this.stockService = stockService;
        this.stockMapper = stockMapper;
    }

    @PostMapping
    public ResponseEntity<Stock> saveStock(@RequestBody StockDto stockDto){
         return ResponseEntity
                 .status(HttpStatus.OK)
                 .body(stockMapper.convertToStock(stockDto));
    }
}
