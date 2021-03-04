package _05_modifier.bai_tap;

public class Circle {
    private final double radius = 1.0;
    private final String color = "red";

    public Circle() {
    }

    public double HinhTron(double radius) {
        return this.radius;
    }

        public double getRadius() {

        return this.radius;
    }

    public double getArea() {

        return this.radius * this.radius * Math.PI;
    }
//    protected double getRadius() {
//
//        return this.radius;
//    }
//
//    protected double getArea() {
//
//        return this.radius * this.radius * Math.PI;
//    }
//     double getRadius() {
//
//        return this.radius;
//    }
//
//     double getArea() {
//
//        return this.radius * this.radius * Math.PI;
//    }
//    private double getRadius() {
//
//        return this.radius;
//    }
//
//    private double getArea() {
//
//        return this.radius * this.radius * Math.PI;
//    }
}
