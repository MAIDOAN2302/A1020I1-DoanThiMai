package _07_abstraction.thuc_hanh.comparetor;

public class Shape {
    String color = "red";
   public Shape(){
   }
    public Shape(String color){
       this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
