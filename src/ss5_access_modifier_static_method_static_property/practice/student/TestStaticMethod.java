package ss5_static_access_modifier.practice.student;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Lan");
        Student s2 = new Student(222, "Nga");
        Student s3 = new Student(333, "Nuong");

        s1.display();
        s2.display();
        s3.display();
    }
}
