package ss5_static_access_modifier.exercise.student;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("STUDENT1: " + student1);

        Student student2 = new Student();
        student2.setName("Nan");
        student2.setClasses("C08");
        System.out.println("STUDENT2: " + student2);

        Student student3 = new Student();
        student3.setName("Diem");
        student3.setClasses("C08");
        System.out.println("STUDENT3: " + student3);
    }
}
