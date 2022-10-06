package ss3_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
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

        System.out.println("Nhap phan tu x can chen: ");
        int number =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vi tri can chen: ");
        int index=Integer.parseInt(scanner.nextLine());

        for (int i = arr.length-1; i < index; i++) {
            int change=arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=change;
        }
        arr[index]=number;
        System.out.println("Mang sau khi them phan tu la: ");
        System.out.println(Arrays.toString(arr));
    }
}
