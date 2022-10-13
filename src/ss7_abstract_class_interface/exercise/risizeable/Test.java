package ss7_abstract_interface.exercise.risizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.3f, "yellow", true);
        shapes[1] = new Rectangle(2, 5, " blue", false);
        shapes[2] = new Square(2, "red", true);

        double percent = Math.floor(Math.random() * 100) + 1;
        System.out.println("Pre-resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape + "\t Area: " + shape.getArea());
        }
        System.out.println("precent: " + percent);

        System.out.println("After-resize: ");
        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println(shape + "\t Area: " + shape.getArea());
        }
    }
}
