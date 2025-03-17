// ProductService.java (서비스 인터페이스)
package com.spring.practice.service;

import com.spring.practice.model.Product;
import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    List<Product> getAllProducts();
}
