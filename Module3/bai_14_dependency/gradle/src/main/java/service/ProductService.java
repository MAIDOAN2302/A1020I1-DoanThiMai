package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save (Product product);

    Product findById(int id);

    Product findByproductName(String productName);

    void update(int id, Product product);

    void remove (int id);

    void search (String productName);
}
