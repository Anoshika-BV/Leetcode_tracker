// Last updated: 7/29/2026, 2:23:10 PM
1class Solution {
2    public boolean canReach(String s, int minJump, int maxJump) {
3        //test
4        int n = s.length();
5        if (s.charAt(n - 1) == '1')
6            return false;
7        boolean[] dp = new boolean[n];
8        dp[0] = true;
9        int reach = 0;
10        for (int i = 1; i < n; i++) {
11            if (i - minJump >= 0) {
12                reach += dp[i - minJump] ? 1 : 0;
13            }
14            if (i - maxJump - 1 >= 0) {
15                reach -= dp[i - maxJump - 1] ? 1 : 0;
16            }
17            if (reach > 0 && s.charAt(i) == '0') {
18                dp[i] = true;
19            }
20        }
21        return dp[n - 1];
22    }
23}