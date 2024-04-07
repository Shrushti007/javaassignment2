package assignment1;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotationSteps = 2; 

        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Right rotation
        rightRotate(arr, rotationSteps);
        System.out.println("Right rotated array: " + Arrays.toString(arr));
        
        // Left rotation
        leftRotate(arr, rotationSteps);
        System.out.println("Left rotated array: " + Arrays.toString(arr));
    }

    // Function to perform right rotation
    static void rightRotate(int[] arr, int steps) {
        int n = arr.length;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, steps - 1);
        reverse(arr, steps, n - 1);
    }

    // Function to perform left rotation
    static void leftRotate(int[] arr, int steps) {
        int n = arr.length;
        reverse(arr, 0, steps - 1);
        reverse(arr, steps, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Function to reverse an array or part of an array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}