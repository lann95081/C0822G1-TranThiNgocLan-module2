package ss6_inheritance.practice.geometry;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2.3);
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
