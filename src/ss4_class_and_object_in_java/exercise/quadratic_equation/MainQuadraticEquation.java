package ss4_class_and_object_in_java.exercise.quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        double number1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap he so b: ");
        double number2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap he so c: ");
        double number3 = Double.parseDouble(scanner.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(number1, number2, number3);
        System.out.println(quadraticEquation.display());
        System.out.println(quadraticEquation.result());

    }
}
