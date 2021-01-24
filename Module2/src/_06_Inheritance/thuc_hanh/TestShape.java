package _06_Inheritance.thuc_hanh;

import sun.awt.image.PixelConverter;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);
    }
}
