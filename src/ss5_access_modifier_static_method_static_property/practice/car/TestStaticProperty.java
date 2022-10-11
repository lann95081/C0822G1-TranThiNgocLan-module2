package ss5_static_access_modifier.practice.car;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "kyactiv 3");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "kyactiv 6 ");
        System.out.println(Car.numberOfCars);
    }
}
