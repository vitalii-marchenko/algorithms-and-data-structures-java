package l06_binary_search;


public class BinarySearch {

    private int binarySearch(int[] arr, int numToFind) throws Exception {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == numToFind) {
                return mid;
            } else if (guess > numToFind) {
                high = mid - 1;
            } else if (guess < numToFind) {
                low = mid + 1;
            }
        }
        throw new Exception(numToFind + " is not is the array!");
    }

    public static void main(String[] args) throws Exception {
        int [] arr = {5,8,77,99,112};
        System.out.println(new BinarySearch().binarySearch(arr, 44));
    }
}
