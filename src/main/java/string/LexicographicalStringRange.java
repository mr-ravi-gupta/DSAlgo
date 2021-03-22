package string;

public class LexicographicalStringRange {
    //Given two string S1 and S2 of length L,
    // the task is to count the number of strings
    // of length L, that exists in between S1 and S2,
    // which are lexicographically greater than S1 but smaller than S2.

    static int findNumberOfStrLexicographically(String src, String dest) {
        long numSrc = convertStrToInteger(src);
        long numDest = convertStrToInteger(dest);
        return numDest < numSrc ? 0 : (int) (numDest - numSrc - 1);
    }

    private static long convertStrToInteger(String str) {
        int n = str.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result * 26 + (str.charAt(i) - 'a');
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findNumberOfStrLexicographically("ddx", "deb"));
    }
}
