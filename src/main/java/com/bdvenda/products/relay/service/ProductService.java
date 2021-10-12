package com.bdvenda.products.relay.service;

import com.bdvenda.products.relay.domains.vo.Product;
import com.bdvenda.products.relay.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findByCode(String code){
        return productRepository.findByCode(code);
    }
}
