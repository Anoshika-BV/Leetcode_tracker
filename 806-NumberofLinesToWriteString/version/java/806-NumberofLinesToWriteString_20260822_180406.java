// Last updated: 8/22/2026, 6:04:06 PM
1class Solution {
2    public int[] numberOfLines(int[] widths, String s) {
3        //test
4        int lines = 1, sum = 0;
5        for(char c : s.toCharArray()) {
6            int w = widths[c - 'a'];
7            if(sum + w > 100) {
8                lines++;
9                sum = 0;
10            }
11            sum += w;
12        }
13        return new int[]{lines, sum};
14    }
15}