// Last updated: 7/9/2026, 9:16:49 AM
class Solution {
    public boolean canJump(int[] nums) {
        //test
        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;        
    }
}