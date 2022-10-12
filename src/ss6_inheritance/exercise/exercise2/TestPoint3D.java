package ss6_inheritance.exercise.exercise2;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(4.2F);
        System.out.println(point3D);

        point3D = new Point3D();
        point3D.setZ(0.3f);
        System.out.println(point3D);

        point3D = new Point3D(1.3f, 4.2f, 2.3f);
        System.out.println(point3D);

        point3D = new Point3D();
        point3D.setXYZ(1, 2, 3);
        System.out.println(point3D);

    }
}
