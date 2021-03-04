package _12_java_collection_framework.bai_tap.product_manager;

public class Product implements Comparable<Product> {
    private String productName;
    private int productId;
    private double productPrice;

    public Product() {
    }

    public Product(String productName, int productId, double productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    void display (){
        System.out.println("Product name is :  " +  productName + "\n"
                + "Product Id : " + productId + "\n"
                + "Product Price : " + productPrice + "\n");
    }

    @Override
    public String toString() {
        return
                "productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", productPrice=" + productPrice ;

    }

    @Override
    public int compareTo(Product product) {
        return product.getProductName().compareTo(product.getProductName());
    }


}