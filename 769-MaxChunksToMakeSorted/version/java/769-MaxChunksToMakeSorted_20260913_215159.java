// Last updated: 9/13/2026, 9:51:59 PM
1class Solution {
2    public int maxChunksToSorted(int[] arr) {
3        //test
4        int max = 0, count = 0;
5
6        for (int i = 0; i < arr.length; i++) {
7            max = Math.max(max, arr[i]);
8
9            if (max == i)
10                count++;
11        }
12
13        return count;
14    }
15}