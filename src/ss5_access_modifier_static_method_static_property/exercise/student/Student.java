package ss5_static_access_modifier.exercise.student;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return this.name;
    }

    public String getClasses() {
        return this.classes;
    }

    public String toString() {
        return String.format("name: %s,classes: %s", getName(), getClasses());
    }
}
