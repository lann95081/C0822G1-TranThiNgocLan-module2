package ss6_inheritance.exercise.exercise2;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println("Array of {x,y} = " + Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);

        point3D = new Point3D(2.4f);
        System.out.println("Array of {x,y} = " + Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);

        point3D = new Point3D(1.3f, 4.2f, 2.3f);
        System.out.println("Array of {x,y} = " + Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }
}
