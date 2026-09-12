// Last updated: 9/12/2026, 10:23:13 AM
1class Solution {
2    public int largestPerimeter(int[] nums) {
3        //test
4        Arrays.sort(nums);
5
6        for (int i = nums.length - 1; i >= 2; i--) {
7            if (nums[i - 1] + nums[i - 2] > nums[i])
8                return nums[i] + nums[i - 1] + nums[i - 2];
9        }
10
11        return 0;
12    }
13}