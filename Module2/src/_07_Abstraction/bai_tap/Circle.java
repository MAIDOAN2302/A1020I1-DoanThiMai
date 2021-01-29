package _07_Abstraction.bai_tap;

public class Circle extends Shape{
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
        return super.color +
                "Circle{" +
                "radius = " + radius +
                '\'' +
                "Area = " + getArea() +
                '}';
    }
}
