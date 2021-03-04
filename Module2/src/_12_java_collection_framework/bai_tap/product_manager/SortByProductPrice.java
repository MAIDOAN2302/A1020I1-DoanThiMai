package _12_java_collection_framework.bai_tap.product_manager;

import java.util.Comparator;

public class SortByProductPrice implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getProductPrice() > product2.getProductPrice()){
            return 1;
        }else if (product1.getProductPrice() == product2.getProductPrice()){
            return 0;
        }else {
            return -1;
        }
    }
}
