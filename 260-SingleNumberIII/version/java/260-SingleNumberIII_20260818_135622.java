// Last updated: 8/18/2026, 1:56:22 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        //test
4        int n = nums.length;
5        int[] result = new int[2];
6        int index = 0;
7
8        for (int i = 0; i < n; i++) {
9            boolean found = false;
10            for (int j = 0; j < n; j++) {
11                if (i != j && nums[i] == nums[j]) {
12                    found = true;
13                    break;
14                }
15            }
16            if (!found) {
17                result[index++] = nums[i];
18                if (index == 2) {
19                    break;
20                }
21            }
22        }
23
24        return result;
25    }
26}