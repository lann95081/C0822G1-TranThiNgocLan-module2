package ss3_method_in_java.exercise;

import java.util.Scanner;

public class SumDiagonalsSquareMatrix {
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

        double[][] arr = new double[row][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập vào a[" + i + "][" + j + "]: ");
                arr[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println("Mang vua tao la: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j) {
                    sum1 += arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < row; j++) {
                if (i + j == arr.length - 1) {
                    sum2 += arr[i][j];
                }
            }
        }
        int sum = sum1 + sum2;
        System.out.println("Tong 2 duong cheo la: " + sum);
    }
}
