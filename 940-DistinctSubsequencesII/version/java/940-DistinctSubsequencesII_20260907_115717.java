// Last updated: 9/7/2026, 11:57:17 AM
1class Solution {
2    //test
3    public int distinctSubseqII(String s) {
4        final long MOD = 1000000007L;
5        
6        long dp = 1;
7        long[] last = new long[26];
8        
9        for (char c : s.toCharArray()) {
10            int index = c - 'a';
11            
12            long oldDp = dp;
13            
14            dp = (2 * dp - last[index] + MOD) % MOD;
15            
16            last[index] = oldDp;
17        }
18        
19        return (int)((dp - 1 + MOD) % MOD);
20    }
21}