package array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayRotation {

    //Write a function rotate(ar[], d, n)
    // that rotates arr[] of size n by d elements.

    static void rotateArrayWithReverse(int arr[], int d){
        int n = arr.length;
        reverseArray(arr, 0, d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr, 0, n-1);
    }

    private static void  reverseArray(int arr[], int i, int j){
        int temp;
        while (i <j) {
            temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
    static void rotateArray(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        int gcdVal = gcd(n, d);
        for (int i = 0; i < gcdVal; i++) {
            int temp = arr[i];
            int j = i;
            while (true) {
                int k = (j + d) % n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }

    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        rotateArray(arr, 3);
        Arrays.stream(arr).forEach(num -> System.out.print(num + ","));
        System.out.println();
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        rotateArrayWithReverse(arr2, 3);
        Arrays.stream(arr2).forEach(num -> System.out.print(num + ","));
    }
}
