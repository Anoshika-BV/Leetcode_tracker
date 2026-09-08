// Last updated: 9/8/2026, 8:57:46 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        //test
4        return solve(s, p, 0, 0);
5    }
6
7    boolean solve(String s, String p, int i, int j) {
8
9        if (j == p.length())
10            return i == s.length();
11
12        boolean match = i < s.length() &&
13                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
14
15        if (j + 1 < p.length() && p.charAt(j + 1) == '*')
16            return solve(s, p, i, j + 2) ||
17                   (match && solve(s, p, i + 1, j));
18
19        return match && solve(s, p, i + 1, j + 1);
20    }
21}