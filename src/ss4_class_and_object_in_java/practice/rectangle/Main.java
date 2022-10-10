package ss4_class_and_object_in_java.practice.rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao cua hinh chu nhat: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap chieu rong cua hinh chu nhat: ");
        double width = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Hinh chu nhat: " + rectangle.display());
        System.out.println("Chu vi hinh chu nhat: " + rectangle.getPerimeter());
        System.out.println("Dien tich hinh chu nhat: " + rectangle.getArea());
    }
}
