package ss10_dsa_list.exercise.exercise1;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
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

        public String toString() {
            return "Name: " + getName() + ", id: " + getId();
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Ngọc Lan");
        Student student2 = new Student(2, "Thuý Diễm");
        Student student3 = new Student(3, "Thuý Nga");
        Student student4 = new Student(4, "Hồ Nương");


        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.remove(0);

        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println((i + 1) + ". " + studentMyList.elements[i]);
        }

        System.out.println(studentMyList.get(2));
    }
}
