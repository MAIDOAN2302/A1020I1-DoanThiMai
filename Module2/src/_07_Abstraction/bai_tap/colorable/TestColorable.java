package _07_Abstraction.bai_tap.colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Blue", 2);
        shapes[1] = new Rectangle("Yellow", 2, 4);
        shapes[2] = new Square("Green", 4);

        for (Shape shape : shapes
        ) {
            if (shape instanceof Square) {
                System.out.print(((Square) shape).toString());
                ((Square) shape).howToColor();

            } else if (shape instanceof Circle) {
                System.out.println(((Circle) shape).toString());
            } else if (shape instanceof Rectangle) {
                System.out.println(((Rectangle) shape).toString());
            }

        }
    }
}
