package ss4_class_and_object_in_java.exercise.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 1;
    final int FAST = 1;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return this.SLOW;
    }

    public int getMEDIUM() {
        return this.MEDIUM;
    }

    public int getFAST() {
        return this.FAST;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn()) {
            return "color: " + getColor() + ", radius: " + getRadius() + ", fan is off.";
        }
        return "speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius() + ", fan is on.";
    }
}
