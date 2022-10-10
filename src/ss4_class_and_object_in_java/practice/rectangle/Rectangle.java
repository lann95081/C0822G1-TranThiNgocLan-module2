package ss4_class_and_object_in_java.practice.rectangle;

public class Rectangle {
    double height, width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public String display() {
        return "Rectangle " + "width=" + width + ", height=" + height + "";
    }
}
