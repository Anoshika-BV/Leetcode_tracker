// Last updated: 8/21/2026, 9:41:07 AM
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        //test
4        Arrays.sort(nums);
5        int n = nums.length;
6        int ans = 0;
7        for(int i = 0; i < n; i += 2)
8            ans += nums[i];
9        return ans;
10    }
11}