package ss3_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementInArray2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print(" Nhap so luong phan tu cua mang: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size <= 0) {
                System.out.println(" So phan thu cua mang phai >=0, vui long nhap lai: ");
            }
        } while (size <= 0);

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print(" Nhap vao a[" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la: " + min);
    }
}
