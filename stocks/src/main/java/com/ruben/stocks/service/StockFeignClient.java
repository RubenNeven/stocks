package com.ruben.stocks.service;

import com.ruben.stocks.controller.dto.StockDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "stockFeignClient", url = "${baseURL}/api/events")
public interface StockFeignClient {

    @PostMapping
    void addStock(StockDto stockDto);
}
