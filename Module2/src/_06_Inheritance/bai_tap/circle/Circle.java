package _06_Inheritance.bai_tap.circle;

public class Circle {
     double radius;
     String color ;

    public Circle(double radius) {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }
    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public double getArea() {

        return this.radius * this.radius * Math.PI;
    }

    public void setArea(double radius)
    {
        this.radius = radius;
    }
    public double getPerimeter() {

        return 2 * this.radius * Math.PI;
    }

    public void setPerimeter(double radius) {

        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                +" and color is "
                + getColor()
                + "\n Area of a circle = "
                + getArea()
                + "\n Perimeter of a circle = "
                + getPerimeter();
    }
}
