// Last updated: 9/8/2026, 8:57:03 AM
1class Solution {
2    public String longestPalindrome(String s) {
3        //test
4        String ans = "";
5
6        for (int i = 0; i < s.length(); i++) {
7            ans = check(s, i, i, ans);
8            ans = check(s, i, i + 1, ans);
9        }
10
11        return ans;
12    }
13
14    public String check(String s, int l, int r, String ans) {
15        while (l >= 0 && r < s.length() &&
16               s.charAt(l) == s.charAt(r)) {
17
18            if (r - l + 1 > ans.length())
19                ans = s.substring(l, r + 1);
20
21            l--;
22            r++;
23        }
24        return ans;
25    }
26}