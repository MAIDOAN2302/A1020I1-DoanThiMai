package _08_clean_code_and_refactoring.thuc_hanh.refactoring_exstract_method;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
