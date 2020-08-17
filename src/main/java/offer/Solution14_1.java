package offer;

public class Solution14_1 {

    public static int cuttingRope(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= (i / 2 + 1); j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }

        return dp[n];

    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
}
