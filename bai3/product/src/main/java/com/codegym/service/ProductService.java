package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {

    List<Product>findAll();

    public void save(Product product);

    public Product findById(int id);

    public void update(int id,Product product);

    public void remove(int id);
}
