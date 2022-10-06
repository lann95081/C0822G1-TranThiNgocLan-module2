package ss3_method_in_java.exercise;

import java.util.Scanner;

public class MaxElemenInArray2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        do {
            System.out.print("Nhập vào hàng: ");
            m = Integer.parseInt(scanner.nextLine());
            if (m <= 0) {
                System.out.println("Số lượng hàng > 0, xin nhập lại!!!");
            }
        } while (m <= 0);
        int n;
        do {
            System.out.print("Nhập vào cột: ");
            n = Integer.parseInt(scanner.nextLine());

            if (n <= 0) {
                System.out.println("Số lượng cột > 0, xin nhập lại!!!");
            }
        } while (n <= 0);

        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập vào a[" + i + "][" + j + "]: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }

        }

        int max = arr[0][0];
        System.out.println("Ma trận vừa tạo: ");
        for (int[] rowArr : arr) {
            for (int colArr : rowArr) {
                System.out.print(colArr + " ");
                if (colArr > max) {
                    max = colArr;
                }
            }
            System.out.println();
        }

        System.out.println("Phần tử lớn nhất trong ma trận: ");
        System.out.println(max);
    }
}
