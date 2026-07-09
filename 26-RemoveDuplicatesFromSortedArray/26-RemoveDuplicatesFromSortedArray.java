// Last updated: 7/9/2026, 9:17:03 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        //test
        if (nums.length == 0) return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;        
    }
}