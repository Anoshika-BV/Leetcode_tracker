// Last updated: 7/27/2026, 9:44:44 AM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int n    = s.length();
4        int curr = 1;
5        int prev = 0;
6        int res  = 0;
7
8
9        for( int i = 1; i < n; i++ ) {
10
11            if( s.charAt(i - 1) == s.charAt(i) ) {
12                curr += 1;
13            }
14            else{
15                
16                res += Math.min( prev, curr );
17                prev = curr;
18                curr = 1;
19            }
20        }
21
22        // for the last part of the string.
23        res += Math.min( prev, curr );
24
25        return res;
26    }
27}