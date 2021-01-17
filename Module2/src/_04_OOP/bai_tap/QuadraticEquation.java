package _04_OOP.bai_tap;

public class QuadraticEquation {
    private double a, b, c;
    private double delta;
    private double x1, x2;

    // a constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = Math.pow(b, 2) - 4 * a * c;
    }

    public void calculate() {
        if (this.delta >= 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co nghiem: \nx1= " + x1 + "\nx2= " + x2);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}