package ss7_abstract_interface.exercise.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(2, "brown", true);
        shapes[1] = new Circle(3, "black", false);
        shapes[2] = new Rectangle(4, 5, "pink", true);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}
