package Lab2;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] params) {
        int[] array = new int[] {127, 224, 336, 152, 100, 111, 222, 400, 860, 420, 744, 500, 320};
        System.out.println(Arrays.toString(array)); // before sorting
        insertionSort(array);
        System.out.println(Arrays.toString(array)); // after sorting
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }
}

// сложность O(nˆ2)