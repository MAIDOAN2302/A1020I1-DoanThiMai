package _07_Abstraction.thuc_hanh.animal;

public class Chicken extends Animal implements Edible{
    @Override
    void makeSound() {
        System.out.println("Chicken say : Ooo");
    }

    @Override
    public void howToEat() {
        System.out.println("Chicken can eat");
    }
}
