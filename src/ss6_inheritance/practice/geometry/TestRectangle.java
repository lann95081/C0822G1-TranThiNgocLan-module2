package ss6_inheritance.practice.geometry;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.3);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.1, 5.2, "pink", true);
        System.out.println(rectangle);
    }
}
