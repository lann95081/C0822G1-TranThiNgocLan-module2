package ss3_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print(" Nhap so luong phan tu cua mang: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println(" So phan thu cua mang phai >=0, vui long nhap lai: ");
            }
        } while (n <= 0);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" Nhap vao a[" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(" Nhap phan tu x can xoa: ");
        int x = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                check = false;
                for (int j = i; j < arr.length - 1; j++) {
                    int change = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = change;
                }
                arr[arr.length - 1] = 0;
            }
        }
        if (check) {
            System.out.println(" Khong tim thay x trong mang");
        } else {
            System.out.println(" Mang sau khi xoa phan tu x la: ");
            System.out.println(Arrays.toString(arr));
        }
    }
}


