package _06_Inheritance.bai_tap;

import java.util.Arrays;

public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public float[] getSpeed() {
        float[] arr2 = {this.xSpeed, this.ySpeed};
        return arr2;
    }
    public MovablePoint move (){
        this.setX(this.getX() +  this.xSpeed);
        this.setY(this.getY() +  this.ySpeed);
        return this;
    }

        @Override
        public String toString() {
            return "MovablePoint{" +
                    ", x=" + x +
                    ", y=" + y +
                    Arrays.toString(getSpeed())
                    + '}';
        }
}
