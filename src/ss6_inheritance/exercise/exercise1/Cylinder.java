package ss6_inheritance.exercise.exercise1;

public class Cylinder extends Circle {
    private double length = 1.0;

    public Cylinder() {
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder(double radius, String color, double length) {
        super(radius, color);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolume() {
        return getArea() * getLength();
    }

    public String toString() {
        return super.toString() + "\t volume: " + getVolume();
    }

}
