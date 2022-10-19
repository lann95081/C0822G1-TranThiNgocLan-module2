package ss11_dsa_stack_queue.execise.reserve;

import java.util.Scanner;
import java.util.Stack;

public class ArrayReserve {
    public static void main(String[] args) {
        Stack<Integer> array = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int length = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < length; i++) {
            System.out.printf("array[%d]=", i);
            array.push(Integer.parseInt(scanner.nextLine()));
        }

        System.out.println("Mảng trước khi đảo ngược: array= " + array);

        Stack<Integer> arrayReserve = new Stack<>();

        while (!array.isEmpty()) {
            arrayReserve.push(array.pop());
        }

        for (int item : arrayReserve) {
            array.push(item);
        }

        System.out.println("Mảng sau khi đảo ngược: array= " + arrayReserve);
    }
}
