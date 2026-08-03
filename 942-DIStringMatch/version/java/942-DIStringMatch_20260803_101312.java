// Last updated: 8/3/2026, 10:13:12 AM
1class Solution {
2    public int[] diStringMatch(String s) {
3        int n = s.length();
4        int low = 0, high = n;
5        int[] ans = new int[n + 1];
6
7        for (int i = 0; i < n; i++) {
8            if (s.charAt(i) == 'I') {
9                ans[i] = low++;
10            } else {
11                ans[i] = high--;
12            }
13        }
14
15        ans[n] = low;
16        return ans;
17    }
18}