// Last updated: 7/28/2026, 2:39:44 PM
1class Solution {
2    public int findGCD(int[] arr) {
3        //test
4        int n= arr.length;
5        int min= arr[0], max= arr[n-1];
6
7        for(int i=0; i<n; i++)
8        {
9            max= Math.max(max, arr[i]);
10            min= Math.min(min, arr[i]);
11        }
12
13        int a= max, b= min;
14        while(b!=0)
15        {
16            int temp= b;
17            b= a%b;
18            a= temp;
19        }
20        return a;
21    }
22}