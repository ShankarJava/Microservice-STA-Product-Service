package org.sfw.micro.ecommerce.service;

import java.util.List;

import org.sfw.micro.ecommerce.model.Product;

public interface ProductService {
public List<Product> findAll();
public List<Product> findByCategory(String category);
public Product findByID(int id);

}
