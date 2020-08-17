package offer;

public class Solution11 {

    public int minArray(int[] numbers) {
        int result = numbers[0];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i - 1 >= 0 && numbers[i - 1] > numbers[i]) {
                result = numbers[i];
                break;
            }
        }
        return result;

    }
}
