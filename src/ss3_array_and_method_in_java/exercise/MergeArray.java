package ss3_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang thu nhat: ");
        int m = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhap phan tu a[" + i + "]: ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr1));

        System.out.print("Nhap so phan tu cua mang thu hai: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhap phan tu a[" + 1 + "][" + i + "] ");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int index = 0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[index];
            index++;
        }
        System.out.println("Mang sau khi gop la: ");
        System.out.println(Arrays.toString(arr3));
    }
}
