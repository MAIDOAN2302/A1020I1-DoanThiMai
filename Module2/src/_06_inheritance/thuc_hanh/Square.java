package _06_inheritance.thuc_hanh;

public class Square extends Rectangle {

    public Square() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
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
       return  "A Square with side= "
                + getSide()
                + " , which is a subclass of "
                + super.toString();
    }
}
