// Last updated: 9/12/2026, 10:23:39 AM
1class Solution {
2    public int minOperations(int[] nums) {
3        //test
4        int count = 0;
5
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i] <= nums[i - 1]) {
8                count += nums[i - 1] + 1 - nums[i];
9                nums[i] = nums[i - 1] + 1;
10            }
11        }
12
13        return count;
14    }
15}