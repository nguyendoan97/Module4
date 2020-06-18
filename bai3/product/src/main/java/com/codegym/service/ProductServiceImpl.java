package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer,Product>products;

    static {
        products =  new HashMap<>();
        products.put(1,new Product(1,"Iphone X",25000000,15,"IPHONE"));
        products.put(2,new Product(2,"Iphone 7",5500000,45,"IPHONE"));
        products.put(3,new Product(3,"Iphone 8 plus",8500000,25,"IPHONE"));
        products.put(4,new Product(4,"Vivo Y55",4500000,30,"VIVO"));
        products.put(5,new Product(5,"Xiaomi Note 8",5000000,25,"XIAOMI"));
        products.put(6,new Product(6,"Samsung Galaxy A9",10000000,40,"SAMSUNG"));
        products.put(7,new Product(7,"Oppo F11",5900000,75,"OPPO"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
