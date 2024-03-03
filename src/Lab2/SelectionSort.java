package Lab2;

public class SelectionSort {

    public static void main(String[] args) {
        int [] array = new int[] {127, 224, 336, 152, 100, 111, 222, 400, 860, 420, 744, 500, 320};

        System.out.println(arrayToString(array)); // before sorting

        for (int i = 0; i < array.length; i++) {
            int minIndex = min(array, i, array.length);

            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }

        System.out.println(arrayToString(array)); // after sorting
    }

    private static int min(int[] array, int start, int end) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < end; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
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