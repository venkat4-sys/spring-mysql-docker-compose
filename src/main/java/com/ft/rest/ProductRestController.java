package com.ft.rest;

import com.ft.entity.Product;
import com.ft.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    @Autowired
    private ProductService productService;


    @PostMapping("/add")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        String s = productService.addProduct(product);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public  ResponseEntity<?> getAllProducts(){
        List<Product> allProducts = productService.getAllProducts();
        return new ResponseEntity<>(allProducts, HttpStatus.CREATED);
    }
}
