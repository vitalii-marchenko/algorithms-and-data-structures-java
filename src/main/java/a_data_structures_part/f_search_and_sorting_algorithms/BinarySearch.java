package a_data_structures_part.f_search_and_sorting_algorithms;

public class BinarySearch {

    private boolean binarySearch(int[] arr, int toFind) {
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == toFind) {
                return true;
            } else if (guess > toFind) {
                high = mid - 1;
            } else if (guess < toFind) {
                low = mid + 1;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int [] myArr = {1,2,3,4,5,6,7,8,9,10,100,120,800};
        System.out.println(new BinarySearch().binarySearch(myArr, 11));
    }
}
