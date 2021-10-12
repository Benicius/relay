package com.bdvenda.products.relay.controller;

import com.bdvenda.products.relay.domains.vo.Product;
import com.bdvenda.products.relay.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products-relay")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/product/{code}")
    public Product findByCode(@PathVariable("code") String code){
        return productService.findByCode(code);
    }

}
