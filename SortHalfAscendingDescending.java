package assignment1;

import java.util.Arrays;

public class SortHalfAscendingDescending {
    public static void main(String[] args) {
        int[] arr = {1, 90, 34, 89, 7, 9};
        int n = arr.length;

        Arrays.sort(arr, 0, n / 2);

        for (int i = n / 2, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        
        System.out.println("Sorted array with first half in ascending and second half in descending:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}