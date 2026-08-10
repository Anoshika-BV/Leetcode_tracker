// Last updated: 8/10/2026, 1:47:40 PM
1class Solution {
2    public int firstUniqChar(String s) {
3    //test
4                for (int i = 0; i < s.length(); i++) {
5            char ch = s.charAt(i);
6
7            if (s.indexOf(ch) == s.lastIndexOf(ch))
8                return i;
9        }
10
11        return -1;
12    }
13}