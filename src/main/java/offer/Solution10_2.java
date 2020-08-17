package offer;

public class Solution10_2 {

    public static int numWays(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }else if(n==2){
            return 2;
        } else {
            long  i = 1, j = 2;
            long tmp = 0;
            for (int k = 3; k <= n; k++) {
                tmp = i + j;
                i = j;
                j = tmp;
                if (i >= 1000000007 && j >= 1000000007) {
                    i = i % 1000000007;
                    j = j % 1000000007;
                }
            }
            return (int)(j% 1000000007);
        }

    }
    public static void main(String[] args) {
        System.out.println(numWays(44));
    }
}
