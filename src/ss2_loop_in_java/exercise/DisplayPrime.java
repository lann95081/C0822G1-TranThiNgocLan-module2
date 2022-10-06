package ss2_array_and_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" So luong so nguyen to can in ra: ");
        int numbers = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i < Math.sqrt(numbers); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
