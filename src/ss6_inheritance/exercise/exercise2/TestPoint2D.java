package ss6_inheritance.exercise.exercise2;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println("Array of {x,y} = " + Arrays.toString(point2D.getXY()));
        System.out.println(point2D);

        point2D = new Point2D(2.3f, 5.4f);
        System.out.println("Array of {x,y} = " + Arrays.toString(point2D.getXY()));
        System.out.println(point2D);

    }
}
