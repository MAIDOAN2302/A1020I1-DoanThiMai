package _07_Abstraction.bai_tap;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(){

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
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
    public void setArea(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return super.color
                +"Rectangle{" +
                "length = " + length +
                ", width = " + width +
                 '\'' +
                "Area = " + getArea() +
                '}';
    }
}
