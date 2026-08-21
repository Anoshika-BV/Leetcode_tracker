// Last updated: 8/21/2026, 9:27:24 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        //test
4        int count = 0, ans = 0;
5
6        for (int num : nums) {
7            if (num == 1) {
8                count++;
9            } else {
10                count = 0;
11            }
12            ans = Math.max(count, ans);
13        }
14
15        return ans;
16    }
17}