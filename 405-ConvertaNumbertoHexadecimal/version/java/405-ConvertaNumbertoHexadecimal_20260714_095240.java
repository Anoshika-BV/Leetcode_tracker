// Last updated: 7/14/2026, 9:52:40 AM
1class Solution {
2    public String toHex(int num) {
3        //test
4        if (num == 0)
5            return "0";
6
7        char[] hex = {
8            '0','1','2','3','4','5','6','7',
9            '8','9','a','b','c','d','e','f'
10        };
11
12        String ans = "";
13
14        while (num != 0) {
15            ans = hex[num & 15] + ans;
16            num >>>= 4;
17        }
18
19        return ans;
20    }
21}