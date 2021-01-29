package _07_Abstraction.thuc_hanh;

public class TestAnimal {
    public static void main(String[] args) {
//       Animal[] animals = new Animal[2];
//       animals[0] = new Tiger();
//       animals[1] = new Chicken();
//
//        for (Animal animal:animals
//             ) {
//            animal.makeSound();
//        }
        Animal animal = new Tiger();
        Animal animal1 = new Chicken();

        animal.makeSound();
        animal1.makeSound();

        if (animal instanceof Chicken){
            System.out.println("Chicken");
        }

        if (animal instanceof Tiger){
            System.out.println("Tiger");
        }
        if (animal instanceof Animal){
            System.out.println("Animal");
        }
        if (animal1 instanceof Tiger){
            System.out.println("animal1 relations with Tiger");
        }
        if (animal1 instanceof Edible){
            System.out.println("animal1 relation with edible");
        }else {
            System.out.println("animal1 nor relation with edible");
        }

    }
}
