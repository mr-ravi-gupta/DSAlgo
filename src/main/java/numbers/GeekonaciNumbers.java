package numbers;

import java.util.Scanner;
/*Geek created a random series and given a
name geek-onacci series. Given four integers A, B, C, N. A, B, C
represents the first three numbers of geek-onacci series.
Find the Nth number of the series.
The nth number of geek-onacci series is a sum of the
last three numbers (summation of N-1th, N-2th, and N-3th geek-onacci numbers)
 */
public class GeekonaciNumbers {

    private static int findNthGeekonaciNumberRecur(int x, int y, int z, int n, int [] arr){
        if(n ==1)
            return x;
        if(n ==2)
            return y;
        int k;

        for (int i = 4; i <=n ; i++) {
            k = x+y+z;
            x =y;
            y=z;
            z=k;
        }
        return z;
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(findNthGeekonaciNumberRecur(x,y,z,n, new int[n+1]));
        }
    }
}
