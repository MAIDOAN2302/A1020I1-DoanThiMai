package _07_Abstraction.thuc_hanh.animal;

public abstract class Fruit implements Edible {
    @Override
    public void howToEat() {
        System.out.println("Fruit can eat");
    }
}
