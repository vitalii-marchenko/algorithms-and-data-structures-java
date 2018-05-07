package a_data_structures_part.h_sorting_algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SelectionSort {

    public int[] sort(int[] arrToSort) {
        int[] sorted = new int[arrToSort.length];
        List<Integer> listToSort = new ArrayList<>();
        for (Integer n : arrToSort) {
            listToSort.add(n);
        }

        Iterator iterator = listToSort.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            int smallestIndex = findSmallestIndex(listToSort);
            sorted[index] = listToSort.get(smallestIndex);
            listToSort.remove(smallestIndex);
            index++;
        }
        return sorted;
    }

    private int findSmallestIndex(List<Integer> listToSort) {
        int smallestElem = listToSort.get(0);
        int smallestIndex = 0;
        for (int i = 1; i < listToSort.size(); i++) {
            if (listToSort.get(i) < smallestElem) {
                smallestElem = listToSort.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,0,9,6};
        new SelectionSort().sort(arr);
    }

}
