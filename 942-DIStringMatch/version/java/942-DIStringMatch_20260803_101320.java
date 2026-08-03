// Last updated: 8/3/2026, 10:13:20 AM
1class Solution {
2    public int[] diStringMatch(String s) {
3        //test
4        int n = s.length();
5        int low = 0, high = n;
6        int[] ans = new int[n + 1];
7
8        for (int i = 0; i < n; i++) {
9            if (s.charAt(i) == 'I') {
10                ans[i] = low++;
11            } else {
12                ans[i] = high--;
13            }
14        }
15
16        ans[n] = low;
17        return ans;
18    }
19}