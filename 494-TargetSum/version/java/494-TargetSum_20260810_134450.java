// Last updated: 8/10/2026, 1:44:50 PM
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        //test
4        return solve(nums, 0, 0, target);
5    }
6
7    public int solve(int[] nums, int index, int sum, int target) {
8
9        if (index == nums.length) {
10            if (sum == target)
11                return 1;
12            return 0;
13        }
14
15        int plus = solve(nums, index + 1, sum + nums[index], target);
16
17        int minus = solve(nums, index + 1, sum - nums[index], target);
18
19        return plus + minus;
20    }
21}