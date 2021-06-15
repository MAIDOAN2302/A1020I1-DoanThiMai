package vn.codegym.service;

import vn.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"CocaCoLa",10.000,"Stock"));
        products.put(2,new Product(2,"7Up",10.000,"Stock"));
        products.put(3,new Product(3,"Sting",10.000,"Stock"));
        products.put(4,new Product(4,"Pepsi",10.000,"Stock"));
        products.put(5,new Product(5,"Mirinda",10.000,"Stock"));
        products.put(6,new Product(6,"Sprite",10.000,"Stock"));
        products.put(7,new Product(7,"Fanta",10.000,"Stock"));
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
