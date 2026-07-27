// Last updated: 7/27/2026, 2:06:02 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        //test
4        boolean[] flag = new boolean[1001];
5
6        for (int num : nums1) {
7            flag[num] = true;
8        }
9
10        int[] result = new int[Math.min(nums1.length, nums2.length)];
11        int index = 0;
12
13        for (int num : nums2) {
14            if (flag[num]) {
15                result[index++] = num;
16                flag[num] = false;
17            }
18        }
19
20        return Arrays.copyOf(result, index);
21    }
22}