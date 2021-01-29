package com.udemy.thymeleaf.controller;

import com.udemy.thymeleaf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product")
    public String getProduct(){
        return "redirect:/product";
    }

    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProduct(id));
        return "product";
    }
}
