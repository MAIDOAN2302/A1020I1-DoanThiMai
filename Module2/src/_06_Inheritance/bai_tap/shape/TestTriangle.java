package _06_Inheritance.bai_tap.shape;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        Triangle triangle1 = new Triangle("red",1,2,3);
        System.out.println(triangle1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of the sides of the triangle: ");
        double side1 = sc.nextInt();
        double side2 = sc.nextInt();
        double side3 = sc.nextInt();
        System.out.println("Input the color of the triangle : ");
        String color1 = sc.nextLine();
        String color = sc.nextLine();
        Triangle triangle2 = new Triangle(color,side1,side2,side3);
        System.out.println(triangle2);
    }
}
