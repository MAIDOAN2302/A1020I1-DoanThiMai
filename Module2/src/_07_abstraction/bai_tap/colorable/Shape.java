package _07_abstraction.bai_tap.colorable;

public abstract class Shape {
    String color;
    abstract void Area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "shape { " +
                "color = '" + getColor() + '\'' +
                '}';
    }
}
