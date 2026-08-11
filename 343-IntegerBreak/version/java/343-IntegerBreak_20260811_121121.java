// Last updated: 8/11/2026, 12:11:21 PM
1class Solution {
2    public int integerBreak(int n) {
3        //test
4        if(n==2)
5            return 1;
6        if(n==3)
7            return 2;
8        int prod =1;
9        while(n>4)
10        {
11            prod*=3;
12            n-=3;
13        }
14        prod*=n;
15        return prod;
16        
17    }
18}