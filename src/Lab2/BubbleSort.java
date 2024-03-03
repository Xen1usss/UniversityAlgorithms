package Lab2;

public class BubbleSort {

    public static void main(String[] params) {
        int[] array = new int[]{127, 224, 336, 152, 100, 111, 222, 400, 860, 420, 744, 500, 320};
        System.out.println(arrayToString(array)); // before sorting
        bubbleSort(array);
        System.out.println(arrayToString(array)); // after sorting
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
// сложность O(nˆ2)