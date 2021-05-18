package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products = new HashMap<>();
    static {
        products.put(1,new Product(1,"Heineken",440.000,
                "One Box of 24 330ml cans","Heineken"));
        products.put(2,new Product(2,"Tiger",330.000,
                "One Box of 24 330ml cans","Công ty CP Thực phẩm Công Nghệ Sài Gòn (INFOODCO)"));
        products.put(3,new Product(3,"Larue",207.000,
                "One Box of 24 330ml cans","Công ty TNHH Nhà Máy Bia Việt Nam"));
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
    public Product findByproductName(String productName) {

        return products.get(productName);
    }

    @Override
    public void update(int id, Product product) {

        products.put(id,product);
    }

    @Override
    public void remove(int id) {

        products.remove(id);
    }

    @Override
    public void search(String productName) {

        products.get(productName);
    }

}
