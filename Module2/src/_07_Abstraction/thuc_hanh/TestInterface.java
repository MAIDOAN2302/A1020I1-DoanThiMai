package _07_Abstraction.thuc_hanh;

public class TestInterface {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        Fruit fruit1 = new Orange();

        fruit.howToEat();
        fruit1.howToEat();

        if (fruit instanceof Apple){
            System.out.println("Fruit relations with Apple");
        }else {
            System.out.println("Fruit relations with Orange");
        }
        if (fruit1 instanceof Apple){
            System.out.println("Fruit relations with Apple");
        }else {
            System.out.println("Fruit relations with Orange");
        }
        if (fruit instanceof Fruit){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        if (fruit1 instanceof Fruit){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
