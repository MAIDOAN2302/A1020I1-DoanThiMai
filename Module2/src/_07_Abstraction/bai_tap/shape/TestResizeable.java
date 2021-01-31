package _07_Abstraction.bai_tap.shape;

public class TestResizeable {
    public static void main(String[] args) {
        Shape shapes[]= new Shape[3];
        shapes[0]= new Circle("Red",3);
        shapes[1]= new Rectangle("Blue",3,2);
        shapes[2]= new Square("Black",3);
        double percent=(int)(Math.random()*100);

        System.out.println("Area of before change : ");
        for (Shape shape:shapes){
            if (shape instanceof Circle){
                System.out.println("Area of Circle is :  "+
                        ((Circle) shape).getArea());
            } else if (shape instanceof Square){
                System.out.println("Area of Square is:  "+
                        ((Square) shape).getArea());
            } else if (shape instanceof Rectangle){
                System.out.println("Area of Rectangle is:  "+
                        ((Rectangle) shape).getArea());
            }        }
        System.out.println("Area of after change : ");
        System.out.println("Percent up : "+percent+"%");
        for (Shape shape:shapes){
            if (shape instanceof Circle){
                ((Circle) shape).resize(percent);
            } else if(shape instanceof Square){
                ((Square) shape).resize(percent);
            } else if (shape instanceof Rectangle){
                ((Rectangle) shape).resize(percent);
            }        }
    }
}
