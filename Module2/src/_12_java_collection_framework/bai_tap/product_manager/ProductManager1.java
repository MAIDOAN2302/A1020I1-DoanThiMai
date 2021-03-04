package _12_java_collection_framework.bai_tap.product_manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager1 {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    // 1. add
    public void add(Product product) {
        System.out.println("New product you want to input : ");
        System.out.println("Input product name : ");
        String productName = scanner.next();
        System.out.println("Input product id : ");
        int productId = scanner.nextInt();
        System.out.println("Input product price : ");
        Double productPrice = scanner.nextDouble();
        productList.add(new Product(productName, productId, productPrice));
    }

    // 2. edit
    public void edit() {
        System.out.println("Input product id you want to edit : ");
        int editId = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId() == editId) {
                while (true) {
                    System.out.println("Enter item you want to edit : ");
                    System.out.println("1. Product name : ");
                    System.out.println("2. Product Id : ");
                    System.out.println("3. Product price : ");
                    System.out.println("0. Exit : ");
                    int chooseEdit = scanner.nextInt();
                    switch (chooseEdit) {
                        case 1:
                            scanner.nextLine();
                            System.out.println("Input new name of product : ");
                            String newName = scanner.nextLine();
                            productList.get(i).setProductName(newName);
                            break;
                        case 2:
                            scanner.nextLine();
                            System.out.println("Input new id of product : ");
                            int newId = scanner.nextInt();
                            productList.get(i).setProductId(newId);
                            break;
                        case 3:
                            scanner.nextLine();
                            System.out.println("Input new price of product : ");
                            Double newPrice = scanner.nextDouble();
                            productList.get(i).setProductPrice(newPrice);
                            break;
                        case 0:
                            return;

                        default:
                            System.out.println("invalid! please choose action in below menu:");
                            break;
                    }
                }
            } else {
                System.out.println("Khong the tim thay Id da nhap : ");
            }
        }
    }

    // 3. delete
    public void delete() {
        System.out.println("Enter product id you want to delete : ");
        int deleteId = scanner.nextInt();
        boolean checkDelete = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId() == deleteId) {
                productList.remove(productList.get(i));
                break;
            } else {
                System.out.println(" Can't find id of product : ");

            }
        }
    }

    //4. showMenu
    public void showMenu() {
        if (productList.size() == 0) {
            System.out.println("No product in the list : ");
        } else {
            for (Product products : productList) {
                System.out.println("Product List: ");
                products.display();
            }
        }
    }

    // 5. search
    public void search() {
        System.out.println("Enter product name you want search : ");
        String productName = scanner.next();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductName().equals(productName)) {
                System.out.println("Information of product you want find : ");
                System.out.println("Product name : " + productList.get(i).getProductName());
                System.out.println("Product id : " + productList.get(i).getProductId());
                System.out.println("Product price : " + productList.get(i).getProductPrice());
                break;
            } else {
                System.out.println("Can't find product you want search : ");
            }
        }

    }

    //6. sort
    public void sortByProductPrice() {
        SortByProductPrice sortProductByPrice = new SortByProductPrice();
        Collections.sort(productList, sortProductByPrice);
        System.out.println("Sort by price of product: ");
        System.out.println();
        showMenu();
    }
//
//    public void sortByProductName() {
//        Collections.sort(productList);
//        for (Product products : productList) {
//            System.out.println(products.toString());
//        }
//    }
//

}


