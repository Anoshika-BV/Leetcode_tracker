// Last updated: 7/9/2026, 9:15:42 AM
class Solution {
    public int missingNumber(int[] nums) {
        //test
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }
}