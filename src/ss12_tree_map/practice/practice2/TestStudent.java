package ss12_tree_map.practice.practice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Huynh Trung Thuyen", 28, "Hue");
        Student student2 = new Student("Ngoc Lan", 18, "Quang Binh");
        Student student3 = new Student("Thuy Diem", 21, "Quang Nam");

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Thuyen");
        studentMap.put(2, "Lan");
        studentMap.put(3, "Diem");

        Set<Integer> stringSet = studentMap.keySet();
        for (Integer key : stringSet) {
            System.out.printf("%s - %s\n", key, studentMap.get(1));
        }

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
