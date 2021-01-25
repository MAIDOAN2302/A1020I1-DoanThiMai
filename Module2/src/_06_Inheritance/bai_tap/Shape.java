package _06_Inheritance.bai_tap;

public class Shape {
    String color;

    public Shape() {
        this.color = "green";
    }
    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "The Color of Shape is "
                + color;
    }
}
