package model;

public class Product {
    private int id;
    private String productName;
    private double productPrice;
    private String productOfDescription;
    private String maker;

    public Product() {
    }

    public Product(int id, String productName, double productPrice, String productOfDescription, String maker) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productOfDescription = productOfDescription;
        this.maker = maker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductOfDescription() {
        return productOfDescription;
    }

    public void setProductOfDescription(String productOfDescription) {
        this.productOfDescription = productOfDescription;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
