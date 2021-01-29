package com.ruben.stocks.controller;

import com.ruben.stocks.model.Stock;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/stock")
public class StockController {

    @GetMapping("/addStock")
    public String displayAddStockPage(@ModelAttribute("stock") Stock stock, Model model){
        List<String> sectorList = Arrays.asList("Healthcare", "Energy", "Technology");
        model.addAttribute("sectorList", sectorList);
        return "addstock";
    }
}
