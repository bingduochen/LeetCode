package offer;

public class Solution17 {
    public int[] printNumbers(int n) {
        if (n <= 0) {
            return new int[0];
        }
        int maxNum = 0;
        for (int i = 1; i <= n; i++) {
            maxNum = maxNum * 10 + 9;
        }
        int[] result = new int[maxNum];
        for (int i = 0; i < maxNum; i++) {
            result[i] = i + 1;
        }
        return result;


    }
}
