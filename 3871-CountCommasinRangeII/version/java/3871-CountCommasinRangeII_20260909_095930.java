// Last updated: 9/9/2026, 9:59:30 AM
1class Solution {
2    public long countCommas(long n) {
3        //test
4        long ans = 0;
5        long p = 1000;
6
7        while (p <= n) {
8            ans += n - p + 1;
9            p *= 1000;
10        }
11
12        return ans;
13    }
14}