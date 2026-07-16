// Last updated: 7/16/2026, 11:43:06 AM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        //test
4        int sum = 0;
5        for (int i = 0; i < k; i++) {
6            sum += nums[i];
7        }
8
9        int maxSum = sum;
10        for (int i = k; i < nums.length; i++) {
11            sum = sum + nums[i] - nums[i - k];
12            maxSum = Math.max(maxSum, sum);
13        }
14
15        return (double) maxSum / k;
16    }
17}