package com.mogere.productservice.repository;

import com.mogere.productservice.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    Product saveProduct(Product newProduct);

    List<Product> getAllProducts();


    Product getProductById(Long productId);
}
