package _06_Inheritance.bai_tap.point1;

import java.util.Arrays;

public class Point3D extends Point2D {
    float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYX(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float [] getXYZ (){
        float [] arr = {this.x, this.y, this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                " , Output array : " +
                Arrays.toString(getXYZ()) +
                '}';
    }
}
