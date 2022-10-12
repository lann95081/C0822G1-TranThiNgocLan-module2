package ss6_inheritance.exercise.exercise1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle();
        circle.setRadius(2.8);
        System.out.println(circle);

        circle = new Circle(3.5, "pink");
        System.out.println(circle);
    }
}
