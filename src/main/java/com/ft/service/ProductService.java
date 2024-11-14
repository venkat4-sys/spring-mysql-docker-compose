package com.ft.service;

import com.ft.entity.Product;

import java.security.PublicKey;
import java.util.List;

public interface ProductService {

    public String addProduct(Product product);

    public List<Product> getAllProducts();
}
