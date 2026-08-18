// Last updated: 8/18/2026, 2:36:38 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        //test
4        s = s.replace("-", "").toUpperCase();
5        StringBuilder ans = new StringBuilder();
6
7        for (int i = 0; i < s.length(); i++) {
8            if (i > 0 && (s.length() - i) % k == 0)
9                ans.append("-");
10
11            ans.append(s.charAt(i));
12        }
13
14        return ans.toString();
15    }
16}