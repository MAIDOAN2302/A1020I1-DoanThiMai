package _04_OOP.thuc_hanh;

import java.awt.*;
import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width= " + width + "height= " + height + "}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }


}

