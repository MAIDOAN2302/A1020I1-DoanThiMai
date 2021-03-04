package _07_abstraction.thuc_hanh.comparable;

public class ComparableCircle extends Circle implements java.lang.Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, double radius) {
        super(color, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()){
            return 1;
        }else if (getRadius() < o.getRadius()){
            return -1;
        }else {
            return 0;
        }
    }
}
