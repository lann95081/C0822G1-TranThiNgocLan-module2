package ss7_abstract_interface.exercise.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(2, "brown", true);
        shapes[1] = new Square(3, "black", false);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}
