package _04_OOP.bai_tap;

public class RunnerQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation eq1 = new QuadraticEquation(1.0,3,1);
        QuadraticEquation eq2 = new QuadraticEquation(1,2.0,1);
        QuadraticEquation eq3 = new QuadraticEquation(1,2,3);
        eq1.calculate();
        eq2.calculate();
        eq3.calculate();
    }
}
