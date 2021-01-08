package _01_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Su_dung_toan_tu {
    public static void main(String[] args) {
        float weight;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input is weight:");
        weight = scanner.nextFloat();

        System.out.println("Input is height:");
        height = scanner.nextFloat();

        float area = weight * height;
        System.out.println("Area = " + area);
    }
}
