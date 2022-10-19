package ss11_dsa_stack_queue.execise.reserve;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StringReserve {
    public static void main(String[] args) {
        Stack<String> stringReserve = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kì: ");
        String string = scanner.nextLine();

        String[] stringArr = string.split("");
        System.out.println(Arrays.toString(stringArr));

        for (String item : stringArr) {
            stringReserve.push(item);
        }

        string = "";
        while (!stringReserve.isEmpty()) {
            string += stringReserve.pop() + "";
        }
        System.out.println(string);
    }
}
