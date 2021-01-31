package _07_Abstraction.bai_tap.colorable;

public class Square extends Rectangle implements Colorable {

    public Square(String color, double side) {
        super(color, side, side);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return getWidth();
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
    public void howToColor() {
        System.out.println(" Color all four sides..");
    }

    @Override
    public String toString() {
        return  "Square {" +
                " side = " + getSide() +
                ", color = " + color +
                ", Area = " +  getArea() + '\'' +
                '}';
    }
}
