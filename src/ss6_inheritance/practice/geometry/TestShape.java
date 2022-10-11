package ss6_inheritance.practice.geometry;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("pink", false);
        System.out.println(shape);
    }
}
