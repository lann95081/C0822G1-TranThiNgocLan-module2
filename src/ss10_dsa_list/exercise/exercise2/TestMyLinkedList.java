package ss10_dsa_list.exercise.exercise2;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Lan");
        Student student2 = new Student(2, "Diễm");
        Student student3 = new Student(1, "Nga");
        Student student4 = new Student(1, "Nương");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);
        myLinkedList.add(2, student4);

        System.out.println(myLinkedList.indexOf(student2));
    }
}
