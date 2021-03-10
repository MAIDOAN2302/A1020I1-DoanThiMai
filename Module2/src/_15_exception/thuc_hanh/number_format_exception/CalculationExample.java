package _15_exception.thuc_hanh.number_format_exception;

import java.util.Scanner;

public class CalculationExample {
    public static void calc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen x : ");
        int x = scanner.nextInt();
        System.out.println("Nhap so nguyen y : ");
        int y = scanner.nextInt();
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong hai so nguyen x va y la : " + a);
            System.out.println("Hieu hai so nguyen x va y la : " + b);
            System.out.println("Tich hai so nguyen x va y la : " + c);
            System.out.println("Thuong hai so nguyen x va y la : " + d);
        }catch (Exception e){
            System.out.println("Xay ra exception " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        calc();
    }
}
