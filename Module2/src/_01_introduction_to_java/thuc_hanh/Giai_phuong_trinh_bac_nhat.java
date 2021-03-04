package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("Cho bai toan co dang 'a*x + b = 0', nhap so a,b");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0){
            double result = (c - b)/ a;
            // cach1: printf là in theo format
            //System.out.printf("Equation pass with x = %f!\n", result);
            //cach2: in bt
            System.out.println("result = " + result);
        }else {
            if (b == 0){
                System.out.println("Phuong trinh co vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
