package com.bdvenda.products.relay.repository;

import com.bdvenda.products.relay.domains.vo.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    Product findByCode(String code);
}
