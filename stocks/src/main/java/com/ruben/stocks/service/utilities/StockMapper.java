package com.ruben.stocks.service.utilities;

import com.ruben.stocks.controller.dto.StockDto;
import com.ruben.stocks.model.Stock;

public class StockMapper {
    public Stock convertToStock(StockDto stockDto){
        return Stock.builder()
                .id(stockDto.getId())
                .name(stockDto.getName())
                .sector(stockDto.getSector())
                .market(stockDto.getMarket())
                .averagePurchasePrice(stockDto.getAveragePurchasePrice())
                .quantity(stockDto.getQuantity())
                .totalPurchasePrice(stockDto.getTotalPurchasePrice())
                .build();
    }

    public StockDto convertToStockDto(StockDto stock){
        return StockDto.builder()
                .id(stock.getId())
                .name(stock.getName())
                .sector(stock.getSector())
                .market(stock.getMarket())
                .averagePurchasePrice(stock.getAveragePurchasePrice())
                .quantity(stock.getQuantity())
                .totalPurchasePrice(stock.getTotalPurchasePrice())
                .build();
    }
}
