package com.ruben.stocks.controller.dto;

import com.ruben.stocks.model.Market;
import com.ruben.stocks.model.Sector;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StockDto {
    private Long id;
    private String name;
    private String sector;
    private String market;
    private float averagePurchasePrice;
    private int quantity;
    private BigDecimal totalPurchasePrice;
}
