package ss6_inheritance.exercise.exercise2;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(2.3f, 5.4f);
        System.out.println(point2D);

        point2D = new Point2D();
        point2D.setX(2.6f);
        point2D.setY(1.8f);
        System.out.println(point2D);

    }
}
