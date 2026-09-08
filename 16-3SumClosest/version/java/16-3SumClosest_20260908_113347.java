// Last updated: 9/8/2026, 11:33:47 AM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        //test
4        Arrays.sort(nums);
5        int ans = nums[0] + nums[1] + nums[2];
6
7        for (int i = 0; i < nums.length - 2; i++) {
8            int l = i + 1, r = nums.length - 1;
9
10            while (l < r) {
11                int sum = nums[i] + nums[l] + nums[r];
12
13                if (Math.abs(sum - target) < Math.abs(ans - target))
14                    ans = sum;
15
16                if (sum < target) l++;
17                else if (sum > target) r--;
18                else return sum;
19            }
20        }
21        return ans;
22    }
23}