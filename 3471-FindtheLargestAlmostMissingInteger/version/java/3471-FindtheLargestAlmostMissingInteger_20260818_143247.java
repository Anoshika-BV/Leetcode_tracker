// Last updated: 8/18/2026, 2:32:47 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        //test
4        int n = nums.length;
5        final int MAX = 50;
6        int freq[] = new int[MAX + 1];
7        int max = Integer.MIN_VALUE;
8        for(int x: nums) {
9            freq[x]++;
10            max = Math.max(max, x);
11        }
12        if(k == n) {
13            return max;
14        }else if(k == 1) {
15            for(int i = MAX; i >= 0; i--) {
16                if(freq[i] == 0) continue;
17                if(freq[i] == 1) return i;
18            }
19            return -1;
20        }else {
21            max = -1;
22            if(freq[nums[0]] == 1) max = Math.max(max, nums[0]);
23            if(freq[nums[n - 1]] == 1) max = Math.max(max, nums[n - 1]);
24            return max;
25        }
26    }
27}