package ss14_sort_algorithms.exercise.illustration_insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InSertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("array[%d]=", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng số nguyên vừa tạo: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int index = i;

            while (index > 0 && value < array[index - 1]) {
                array[index] = array[index - 1];
                index--;
            }

            array[index] = value;
        }
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
    }
}
