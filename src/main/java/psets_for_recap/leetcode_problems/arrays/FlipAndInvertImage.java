package psets_for_recap.leetcode_problems.arrays;

/**
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 *
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 *
 * Example 1:
 *
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * Example 2:
 *
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Notes:
 *
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 */

public class FlipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] A) {
        int[][] flipped = flip(A);
        return flipped;
    }

    private int[][] flip(int[][] arr) {
        int len = arr.length;
        int[][] flippedOuter = new int[len][];
        int outerIndex = 0;
        for (int[] a : arr) {
            int innerLen = a.length;
            int[] flippedInner = new int[innerLen];
            int index = 0;
            for (int i = innerLen - 1; i >= 0; i--) {
                if (a[index] == 0) {
                    flippedInner[i] = 1;
                } else {
                    flippedInner[i] = 0;
                }
                //flippedInner[i] = a[index];
                index++;
            }
            flippedOuter[outerIndex] = flippedInner;
            outerIndex++;
        }
        return flippedOuter;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0,0}, {0,1,1,0}};
        new FlipAndInvertImage().flip(arr);
    }
}
