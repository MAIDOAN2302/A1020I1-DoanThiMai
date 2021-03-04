package _07_abstraction.thuc_hanh.animal;

import _06_inheritance.bai_tap.circle.Circle;

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
