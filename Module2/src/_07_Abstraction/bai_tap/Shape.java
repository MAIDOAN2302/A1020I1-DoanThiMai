package _07_Abstraction.bai_tap;

public class Shape {
    String color;
   public Shape(){
   }
    public Shape(String color){
       this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
