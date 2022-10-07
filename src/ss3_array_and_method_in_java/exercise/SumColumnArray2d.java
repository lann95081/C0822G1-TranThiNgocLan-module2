package ss3_method_in_java.exercise;

import java.util.Scanner;

public class SumColumnArray2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        do {
            System.out.print("Nhập vào hàng: ");
            row = Integer.parseInt(scanner.nextLine());
            if (row <= 0) {
                System.out.println("Số lượng hàng > 0, xin nhập lại!!!");
            }
        } while (row <= 0);
        int col;
        do {
            System.out.print("Nhập vào cột: ");
            col = Integer.parseInt(scanner.nextLine());

            if (col <= 0) {
                System.out.println("Số lượng cột > 0, xin nhập lại!!!");
            }
        } while (col <= 0);

        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập vào a[" + i + "][" + j + "]: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mang vua tao la: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        int number;
        do {
            System.out.println("Nhap cot can tinh tong: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0 || number >= col) {
                System.out.println("Vui long nhap lai ");
            }
        } while (number < 0 || number >= col);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][number];
        }
        System.out.println("Tong la: " + sum);
    }

}
