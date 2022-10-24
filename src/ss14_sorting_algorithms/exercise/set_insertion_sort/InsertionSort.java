package ss14_sort_algorithms.exercise.set_insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    static int[] list = {2, 8, 9, 5, 7, 4, -1, -5, 4, -7};

    public static void main(String[] args) {
        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(list));
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(insertSort(list)));
    }

    public static int[] insertSort(int[] array) {
        int value;
        int index;
        for (int i = 1; i < array.length; i++) {
            value = array[i];
            index = i;

            while (index > 0 && value < array[index - 1]) {
                array[index] = array[index - 1];
                index--;
            }

            array[index] = value;
        }

        return array;
    }
}
