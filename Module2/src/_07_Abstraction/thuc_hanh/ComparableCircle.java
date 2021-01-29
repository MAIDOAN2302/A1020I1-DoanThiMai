package _07_Abstraction.thuc_hanh;

import _06_Inheritance.bai_tap.Circle;

import javax.swing.*;

public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle() {
    }
    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    @Override
    public void compareTo() {


    }
}
