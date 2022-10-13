package ss7_abstract_interface.exercise.colorable;

public abstract class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + ((isFilled()) ? " filled" : " not filled");
    }
}


