package _06_Inheritance.bai_tap.circle;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(double radius, int height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume(){

        return this.radius * this.radius * this.height * Math.PI;
    }
    public void setVolume(double radius, int height){
        this.height = height;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = "
                + getHeight()
                + " and radius = "
                + getRadius()
                + " and the color "
                + getColor()
                + " . "
                + " The volume is : "
                + getVolume();

    }
}
