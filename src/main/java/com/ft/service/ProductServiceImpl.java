package com.ft.service;

import com.ft.entity.Product;
import com.ft.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public String addProduct(Product product) {
        productRepo.save(product);
        return "product added";
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
