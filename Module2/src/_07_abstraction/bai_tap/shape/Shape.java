package _07_abstraction.bai_tap.shape;

public class Shape {
    String color = "red";
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
