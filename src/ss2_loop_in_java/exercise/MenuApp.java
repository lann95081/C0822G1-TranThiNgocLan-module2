package ss2_array_and_loop_in_java.exercise;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectanglee");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println(" Print the rectangle");
                    System.out.print("Input length: ");
                    int length = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input width: ");
                    int width = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println(" Print the square triangle");
                    System.out.print("Input length: ");
                    int height = Integer.parseInt(scanner.nextLine());
                    System.out.println(" Botton left: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Top left");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Top right");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height; j++) {
                            if (j < i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Botton right");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height; j++) {
                            if (j < height - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.print("Input height: ");
                    int high = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < high; i++) {
                        for (int j = 0; j < high + i; j++) {
                            if (j < high - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println(" No choice ");
            }
        } while (choice != 0);
    }
}
