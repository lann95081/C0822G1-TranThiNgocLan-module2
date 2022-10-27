package ss17_io_binary_file_serialization.practice.read_and_write_list;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Tr?n Th? Ng?c Lan", "Qu?ng B?nh"));
        studentList.add(new Student(2, "Tr?n Th? Thu? Di?m", "Qu?ng Nam"));
        studentList.add(new Student(3, "Ph?m Th? Mai", "Qu?ng B?nh"));
        studentList.add(new Student(4, "Kh?ng ??c Th? Nh?n", "H? N?i"));

        writeToFile(studentList);
        List<Student> studentDataFromFile = readDataFromFile();
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }

    }

    private static List<Student> readDataFromFile() {
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/ss17_io_binary_file_serialization/practice/read_and_write_list/student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    private static void writeToFile(List<Student> studentList) {
        try {
            FileOutputStream fos = new FileOutputStream("src/ss17_io_binary_file_serialization/practice/read_and_write_list/student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
