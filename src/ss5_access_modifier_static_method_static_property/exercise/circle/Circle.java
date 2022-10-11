package ss5_static_access_modifier.exercise.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public String getColor(){
        return color;
    }

    public String toString() {
        return String.format("radius: %1.2f,area: %1.2f,color: %s", getRadius(), getArea(),getColor());
    }
}
