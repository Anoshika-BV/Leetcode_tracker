// Last updated: 9/9/2026, 10:00:48 AM
1class Solution {
2    public int numDistinct(String s, String t) {
3        //test
4        long[] dp = new long[t.length() + 1];
5        dp[0] = 1;
6
7        for (char a : s.toCharArray())
8            for (int j = t.length() - 1; j >= 0; j--)
9                if (a == t.charAt(j))
10                    dp[j + 1] += dp[j];
11
12        return (int) dp[t.length()];
13    }
14}