package array;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Given an integer array arr of size N and two integers K and M,
// the task is to find M largest sums of K sized subarrays.
public class MLargestKSizedSubArray {

    private static void printMLargestKSizedSubArray(int [] arr, int k, int m){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        int currSum =0 ;
        int n = arr.length;
        for (int i = 0; i <k ; i++) {
            currSum +=arr[i];
        }
        queue.add(currSum);
        for (int i = 0; i <n -k ; i++) {
            currSum -= arr[i];
            currSum += arr[i+k];
            queue.add(currSum);
        }

        while (m-- > 0){
            System.out.print(queue.remove() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
           int N = sc.nextInt();
           int K = sc.nextInt();
           int M = sc.nextInt();
           int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            printMLargestKSizedSubArray(arr,K,M);
            System.out.println();
        }
    }
}
