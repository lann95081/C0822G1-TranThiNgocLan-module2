package ss15_exception_debug.exercise.use_illegal_triangle_exception.controller;

import ss15_exception_debug.exercise.use_illegal_triangle_exception.exception.IllegalTriangleException;
import ss15_exception_debug.exercise.use_illegal_triangle_exception.model.Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập cạnh thứ nhất của tam giác: ");
                double firstEdge = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh thứ hai của tam giác: ");
                double secondEdge = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh thứ ba của tam giác: ");
                double thirdEdge = Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(firstEdge, secondEdge, thirdEdge);
                System.out.println(triangle);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập số!");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập đúng giá trị của tam giác!");
            }
        }
    }
}
