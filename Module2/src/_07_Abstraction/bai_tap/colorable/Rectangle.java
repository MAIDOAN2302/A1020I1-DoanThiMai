package _07_Abstraction.bai_tap.colorable;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width;
    }

    public void setArea(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    void Area() {
        System.out.println(getArea());
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                " length = " + length +
                ", width = " + width +
                ", color = " + color +
                ", Area = " +  getArea() + '\'' +
                '}';
    }
}
