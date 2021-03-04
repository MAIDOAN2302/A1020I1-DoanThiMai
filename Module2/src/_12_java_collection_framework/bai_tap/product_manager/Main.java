package _12_java_collection_framework.bai_tap.product_manager;

import java.util.Scanner;

public class Main {
    public static void show() {
        System.out.println("1. Add product : ");
        System.out.println("2. Search product : ");
        System.out.println("3. Edit product : ");
        System.out.println("4. Delete product : ");
        System.out.println("5. Sort product : ");
        System.out.println("6. Show product : ");
        System.out.println("0. exit");
    }
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ProductManager1 productManager1 = new ProductManager1();
        while (true) {
            System.out.println("Menu : ");
            show();
            System.out.println("Enter your choose, pleas : ");
            int choose1 = Integer.parseInt(scanner1.nextLine());


            switch (choose1) {
                case 1:
                    productManager1.add(new Product());
                    break;
                case 2:
                    productManager1.search();
                    break;
                case 3:
                    productManager1.edit();
                    break;
                case 4:
                    productManager1.delete();
                    break;
                case 5:
                    productManager1.sortByProductPrice();
                    break;
                case 6:
                    productManager1.showMenu();
                    break;
                case 0:
                    System.out.println("Exited!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }

        }

    }
}
