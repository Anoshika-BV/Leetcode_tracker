// Last updated: 7/14/2026, 9:41:19 AM
1class Solution {
2    public int arrangeCoins(int n) {
3        //test
4        int ans=0,index=1;
5        while(n>=index){
6            ans++;
7            n-=index;
8            index++;
9        }
10        return ans;
11    }
12}