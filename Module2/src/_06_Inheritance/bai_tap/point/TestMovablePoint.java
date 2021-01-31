package _06_Inheritance.bai_tap.point;

import _06_Inheritance.bai_tap.point.MovablePoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint testMovablePoint = new MovablePoint();
        System.out.println(testMovablePoint);

        MovablePoint testMovablePoint1 = new MovablePoint(1,3);
        System.out.println(testMovablePoint1);

    }
}
