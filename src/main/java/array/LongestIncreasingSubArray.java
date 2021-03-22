package array;

public class LongestIncreasingSubArray {

    static int findLISubArray(int [] arr){
        int n = arr.length;
        int max =Integer.MIN_VALUE; int len=1;
        for (int i = 1; i <n; i++) {
            if(arr[i-1] < arr[i])
                len++;
            else {
                if(max < len)
                    max = len;

                len=1;
            }
        }
        if(max < len)
            max = len;
        return max;
    }

    public static void main(String[] args) {
        int arr[] ={5, 6, 3, 5, 7, 8, 9, 1, 2};
        System.out.println(findLISubArray(arr));
        int arr2[] = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11};
        System.out.println(findLISubArray(arr2));
    }
}
