package _06_Inheritance.thuc_hanh;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.5,5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("red",true,2.5,5.8);
        System.out.println(rectangle);
    }
}
