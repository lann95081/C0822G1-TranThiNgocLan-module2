package ss6_inheritance.practice.geometry;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(3.2, "yellow", true);
        System.out.println(square);
    }
}
