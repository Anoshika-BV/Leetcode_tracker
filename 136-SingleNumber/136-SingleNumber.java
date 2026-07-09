// Last updated: 7/9/2026, 9:16:22 AM
class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int num : nums)
        {
            result = result ^ num;
        }
        return result;
    }
}