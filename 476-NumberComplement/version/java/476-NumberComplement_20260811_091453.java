// Last updated: 8/11/2026, 9:14:53 AM
1class Solution {
2    public int findComplement(int num) {
3        //test
4        if (num == 0) return 1;
5
6        int bitLength = Integer.toBinaryString(num).length();
7        
8        int mask = (1 << bitLength) - 1;
9        
10        return num ^ mask;
11    }
12}