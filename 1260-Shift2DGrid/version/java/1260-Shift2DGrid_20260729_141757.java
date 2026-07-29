// Last updated: 7/29/2026, 2:17:57 PM
1class Solution {
2    public int minElement(int[] nums) {
3        //test
4    int min=Integer.MAX_VALUE;
5        for(int val:nums){
6            int cur=digitSum(val);
7            if(cur<min)min=cur;
8        }
9        return min;
10    }
11    public static int digitSum(int val){
12        int ans=0;
13        while(val>0){
14            ans+=val%10;
15            val/=10;
16        }
17        return ans;
18    }
19}