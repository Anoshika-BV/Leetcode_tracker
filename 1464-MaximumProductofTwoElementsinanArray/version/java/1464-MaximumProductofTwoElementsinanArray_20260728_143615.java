// Last updated: 7/28/2026, 2:36:15 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        //test
4        int max1 = 0;
5        int max2 = 0;
6        for (int num : nums) {
7            if (num > max1) {
8                max2 = max1;
9                max1 = num;
10            }
11            else if (num > max2)
12                max2 = num;
13        }
14        return (max1 - 1) * (max2 - 1);
15    }
16}