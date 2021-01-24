package _06_Inheritance.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5,"red");
        System.out.println(circle);
    }
}
