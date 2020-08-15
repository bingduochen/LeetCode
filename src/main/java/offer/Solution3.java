package offer;

public class Solution3 {
    public int findRepeatNumber(int[] nums) {
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }

                tmp = nums[i];
                nums[i] = nums[nums[i]];
                nums[tmp] = tmp;
            }
        }
        return 0;

    }
}
