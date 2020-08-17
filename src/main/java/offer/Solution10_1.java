package offer;

// https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
public class Solution10_1 {
    public static int fib(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long i = 0, j = 1;
            long tmp = 0;
            for (int k = 2; k <= n; k++) {
                tmp = i + j;
                i = j;
                j = tmp;
                if (i >= 1000000007L && j >= 1000000007L) {
                    i = i % 1000000007L;
                    j = j % 1000000007L;
                }
            }
            return (int) (j % 1000000007L);
        }

    }

}
