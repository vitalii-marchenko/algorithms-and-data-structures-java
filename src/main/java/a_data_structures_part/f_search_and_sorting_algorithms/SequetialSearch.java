package a_data_structures_part.f_search_and_sorting_algorithms;

public class SequetialSearch {

    private boolean sequetialSearch(int[] arr, int itemToFind) {
        boolean found = false;
        for (Integer num : arr) {
            if (num == itemToFind) {
                return true;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int [] myArr = {1,2,3,4,5,6,7,8,9};

        System.out.println(new SequetialSearch().sequetialSearch(myArr, 8));
    }
}
