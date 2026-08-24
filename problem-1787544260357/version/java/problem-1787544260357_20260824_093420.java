// Last updated: 8/24/2026, 9:34:20 AM
1class Solution {
2    public boolean sumGame(String A) {
3        //test
4        int[] sum = {0, 0};
5        int[] q = {0, 0};
6        int n = A.length();
7
8        for (int i = 0; i < n; i++) {
9            int half = i / (n >> 1);
10
11            if (A.charAt(i) == '?')
12                q[half]++;
13            else
14                sum[half] += A.charAt(i) - '0';
15        }
16
17        return ((q[0] + q[1]) % 2 == 1) ||
18               ((sum[0] - sum[1]) << 1) != (q[1] - q[0]) * 9;
19    }
20}