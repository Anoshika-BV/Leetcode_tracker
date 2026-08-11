// Last updated: 8/11/2026, 9:20:37 AM
1class Solution {
2    //test
3    public int findLUSlength(String a, String b) {
4        if (a.equals(b))
5            return -1;
6        return Math.max(a.length(), b.length());
7    }
8}