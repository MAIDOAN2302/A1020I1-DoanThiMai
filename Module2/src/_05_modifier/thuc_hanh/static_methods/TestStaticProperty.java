package _05_modifier.thuc_hanh.static_methods;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(car1.numberOfCars);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(car2.numberOfCars);
    }
}
