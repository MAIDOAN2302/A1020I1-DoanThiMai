package _06_Inheritance.thuc_hanh;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2);
        System.out.println(square);

        square = new Square("blue", true,2);
        System.out.println(square);
    }
}
