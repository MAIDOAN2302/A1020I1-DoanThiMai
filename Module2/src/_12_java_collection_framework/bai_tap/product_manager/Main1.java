package _12_java_collection_framework.bai_tap.product_manager;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        show();
        System.out.println("");
        int choose1 = scanner.nextInt();
        ProductManager1 productManager1 = new ProductManager1();
//
            System.out.println("fsfsf");
//
//            switch (choose1) {
//                case 1:
//                    productManager1.addID();
//                    break;
//                case 2:
//                    productManager1.search();
//                    break;
//                case 3:
//                    productManager1.edit();
//                    break;
//                case 4:
//                    productManager1.delete();
//                    break;
//                case 5:
//                    productManager1.sortByProductName();
//                    break;
//                case 0:
//                    System.out.println("Exited!");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("invalid! please choose action in below menu:");
//                    break;
//            }
    }
    public static  void show(){
        System.out.println("1. Add product : ");
        System.out.println("2. Search product : ");
        System.out.println("3. Edit product : ");
        System.out.println("4. Delete product : ");
        System.out.println("5. Sort product : ");
        System.out.println("0. exit");
    }
}
