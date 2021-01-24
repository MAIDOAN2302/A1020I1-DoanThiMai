package _06_Inheritance.thuc_hanh;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo",false,3.5);
        System.out.println(circle);

    }
}
