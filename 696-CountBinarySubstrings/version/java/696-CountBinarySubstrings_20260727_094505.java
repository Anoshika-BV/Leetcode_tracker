// Last updated: 7/27/2026, 9:45:05 AM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        //test
4        int n    = s.length();
5        int curr = 1;
6        int prev = 0;
7        int res  = 0;
8
9
10        for( int i = 1; i < n; i++ ) {
11
12            if( s.charAt(i - 1) == s.charAt(i) ) {
13                curr += 1;
14            }
15            else{
16                
17                res += Math.min( prev, curr );
18                prev = curr;
19                curr = 1;
20            }
21        }
22        res += Math.min( prev, curr );
23
24        return res;
25    }
26}