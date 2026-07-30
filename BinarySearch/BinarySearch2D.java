package BinarySearchArray;

import java.util.*;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] marks = { { 20, 22, 25, 30 },
                { 29, 36, 40, 43 },
                { 42, 52, 61, 63 } };
        int target = 43;
        System.out.print(Arrays.toString(search(marks, target)));
    }

    static int[] search(int[][] arr, int target) {
        int r = 0, c = arr[r].length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] { r, c };
            }
            if (arr[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return new int[] { -1, -1 };
    }
}
