// Last updated: 7/14/2026, 6:24:41 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        //test
4        long sum = 0, diff = 0;
5
6        for (char c : t.toCharArray()) {
7            sum += c - 'a';
8        }
9
10        for (char c : s.toCharArray()) {
11            diff += c - 'a';
12        }
13
14        return (char) (sum - diff + 'a');
15    }
16}