package _07_abstraction.bai_tap.shape;

public class Rectangle extends Shape implements Resizeable{
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
                +" Rectangle {" +
                " length = " + length +
                ", width = " + width +
                 '\'' +
                "Area = " + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area of Rectangle is : " + getArea()*percent);
    }
}
