package ss3_method_in_java.exercise;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = scanner.nextLine();
        System.out.println("Nhap ki tu can kiem tra: ");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("So lan ki tu xuat hien la: " + count);
    }
}
