package _06_Inheritance.thuc_hanh;

class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea() {

        return this.width * this.width;
    }

    public void setArea(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getPerimeter() {

        return (this.length + this.width) + 2;
    }

    public void setPerimeter(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with = "
                + getWidth()
                + ", and length= "
                + getLength()
                + super.toString();
    }
}
