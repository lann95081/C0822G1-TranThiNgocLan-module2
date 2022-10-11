package ss6_inheritance.exercise.exercise1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.3);
        System.out.println(cylinder);

        cylinder = new Cylinder(2.5, "blue", 4.5);
        System.out.println(cylinder);
    }
}
