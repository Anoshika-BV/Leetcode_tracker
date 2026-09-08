// Last updated: 9/8/2026, 2:08:25 PM
1class Solution {
2    public int countCommas(int n) {
3        //test
4        int count = 0;
5
6        for (int i = 1000; i <= n; i++) {
7            if (i < 1000000)
8                count++;
9        }
10
11        return count;
12    }
13}