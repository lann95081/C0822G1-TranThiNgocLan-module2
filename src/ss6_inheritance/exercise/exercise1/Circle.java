package ss6_inheritance.exercise.exercise1;

public class Circle {
    private double radius = 1.0;
    public String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public String toString() {
        return String.format("%.1f,%.1f,%s", getRadius(), getArea(), getColor());
    }
}
