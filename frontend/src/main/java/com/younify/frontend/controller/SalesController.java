package com.younify.frontend.controller;

import com.younify.frontend.controller.system.SystemDto;
import com.younify.frontend.controller.system.SystemList;
import com.younify.frontend.service.system.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sales")
public class SalesController {

    private final SystemService systemService;

    @Autowired
    public SalesController(SystemService systemService) {
        this.systemService = systemService;
    }

    @GetMapping("/systems")
    public ResponseEntity<SystemList> findAllSystems() {
        List<SystemDto> systems = systemService.getAllSystems();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new SystemList(systems));
    }

    @GetMapping("/crm")
    public String displaycrmForm(Model model) {
        model.addAttribute("erpSystems", systemService.getAllSystems());
        return "sales/crmForm";
    }

    @GetMapping("/offerte")
    public String displayofferteForm() {
        return "sales/offerteForm";
    }

    @GetMapping("/order")
    public String displayorderForm() {
        return "sales/orderForm";
    }

    @GetMapping("/marketing")
    public String displayMarketingForm() {
        return "sales/marketingForm";
    }

    @GetMapping("/webshop")
    public String displayWebshopForm() {
        return "sales/webshopForm";
    }
}
