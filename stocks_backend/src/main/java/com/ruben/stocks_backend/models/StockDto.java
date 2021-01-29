package com.ruben.stocks_backend.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@Builder
@Component
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
