package _07_abstraction.thuc_hanh.comparable;

import _07_abstraction.bai_tap.shape.Resizeable;

public class Circle extends Shape implements Resizeable {
    double radius;

    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return this.radius * this.radius * Math.PI;
    }
    public void setArea(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return
                " Circle{" +
                " radius = " + radius +
                '\'' +", " +
                super.color +
                " & Area = " + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area of Circle " + getArea()*percent);
    }
}
