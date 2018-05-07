package a_data_structures_part.h_sorting_algorithms;

public class BubbleSort {

    public int[] shortBubbleSort(int[] toSort) {
        for (int i = 0; i < toSort.length; i++) {
            boolean exchanges = false;
            for (int j = 0; j < toSort.length - 1; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    exchanges = true;
                    int tmp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = tmp;
                }
            }
            if (!exchanges) {
                break;
            }
        }
        return toSort;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,1,0,5};
        int[] arr2 = {1,2,3,4,5,6};
        new BubbleSort().shortBubbleSort(arr);
        new BubbleSort().shortBubbleSort(arr2);
    }
}
