// Last updated: 7/14/2026, 9:29:31 PM
1class Solution {
2    public boolean isPerfectSquare(long num) {
3        //test
4        long x = num;
5        while (x * x > num) {
6            x = (x + num / x) / 2;
7        }
8        return x * x == num;
9        
10    }
11}