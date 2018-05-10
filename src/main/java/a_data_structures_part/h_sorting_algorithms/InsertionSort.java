package a_data_structures_part.h_sorting_algorithms;

public class InsertionSort {

    public int[] insertionSort(int[] array) {
        int len = array.length;
        for (int index = 1; index < len; index++) {
            int baseElement = array[index];
            int i = index - 1;
            while (i >= 0) {
                if (array[i] > baseElement) {
                    array[i + 1] = array[i];
                    array[i] = baseElement;
                    i--;
                } else {
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,0,2};
        new InsertionSort().insertionSort(arr);
    }
}
