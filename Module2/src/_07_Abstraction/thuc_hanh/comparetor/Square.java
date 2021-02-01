package _07_Abstraction.thuc_hanh.comparetor;

import _07_Abstraction.bai_tap.shape.Rectangle;
import _07_Abstraction.bai_tap.shape.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, double side) {
        super(color, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return " side = " + getSide() + " Area " + getArea()  ;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area of Square is : ");
    }

}
