package _06_inheritance.bai_tap.shape;

public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }
    public void setPerimeter(double side1, double side2, double side3,String color){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }
    public void setArea(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea (){
        return Math.sqrt(getPerimeter()/2
                *((getPerimeter()/2-side1)
                *(getPerimeter()/2-side2)
                *(getPerimeter()/2-side3))
        );
    }

    @Override
    public String toString() {
        return " - Triangle{" +
                " side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
                '}'+
                "\n  + The perimeter = " +
                getPerimeter() +
                ", And area = " +
                getArea() +
                "\n  + The color of the Triangle is : " +
                color;
    }
}
