// Last updated: 7/16/2026, 11:40:47 AM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        //test
4        int n = nums.length;
5        int[] freq = new int[n + 1];
6
7        for (int num : nums) {
8            freq[num]++;
9        }
10
11        int repeat = -1;
12        int missing = -1;
13
14        for (int i = 1; i <= n; i++) {
15            if (freq[i] == 2)
16                repeat = i;
17            else if (freq[i] == 0)
18                missing = i;
19        }
20
21        return new int[]{repeat, missing};
22    }
23}