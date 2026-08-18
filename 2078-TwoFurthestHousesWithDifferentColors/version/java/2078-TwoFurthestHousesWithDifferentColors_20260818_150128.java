// Last updated: 8/18/2026, 3:01:28 PM
1class Solution {
2    static public int maxDistance(int[] colors) {
3        //test
4        final int n=colors.length;
5        final int c0=colors[0], cN=colors[n-1];
6        int lMax=0, rMax=0;
7        for(int i=0; i<n; i++){
8            final int c=colors[i];
9            if (c0!=c && i>lMax) lMax=i;
10            if (cN!=c && n-1-i>rMax) rMax=n-1-i;
11        }
12        return Math.max(lMax, rMax);
13    }
14}