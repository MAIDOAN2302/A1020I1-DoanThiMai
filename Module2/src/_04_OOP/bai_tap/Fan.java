package _04_OOP.bai_tap;

public class Fan {
public static final  int SLOW = 1, MEDIUM = 2, FAST = 3;

private int speed = SLOW;
private boolean on = false;
private double radius = 5;
private String color = "blue";

String tempOn = "";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        if (on){
            tempOn = "Fan is on";
        }else {
            tempOn = "Fan is off";
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", status =" + tempOn +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}

