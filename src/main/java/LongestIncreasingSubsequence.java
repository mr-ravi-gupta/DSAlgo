import java.util.Arrays;

public class LongestIncreasingSubsequence {


    static int findLIS(int[] s) {
        int n = s.length;
        int lis[] = new int[n];
        Arrays.fill(lis, 1);
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <i ; j++) {
               if(s[i] > s[j] && lis[i] < lis[j]+1){
                   lis[i] = lis[j]+1;
               }
            }
        }

        return Arrays.stream(lis).max().getAsInt();
    }

    public static void main(String[] args) {
        int arr[] = {10,22,9,33,21,50,41,60,80};
        System.out.println(findLIS(arr));
    }
}
