package com.udemy.thymeleaf.service;

import com.udemy.thymeleaf.domain.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(Integer id);

    List<Product> listProducts();

}
