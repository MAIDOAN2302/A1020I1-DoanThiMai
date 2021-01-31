package _07_Abstraction.bai_tap.colorable;

public class Circle extends Shape {
    double radius;

    @Override
    void Area() {
        System.out.println(getArea());
    }

    public Circle(String color, double radius) {
        this.color =color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public void setArea(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius =" + radius +
                ", color ='" + color + '\'' +
                ", Area = " + getArea() +
                '}';
    }
}
