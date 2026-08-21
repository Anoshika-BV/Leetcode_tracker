// Last updated: 8/21/2026, 9:21:03 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        //test
4        for (int i = 0; i < nums.length; i++) {
5
6            int num = Math.abs(nums[i]);
7            int index = num - 1;
8
9            if (nums[index] > 0) {
10                nums[index] = -nums[index];
11            }
12        }
13        List<Integer> ans = new ArrayList<>();
14
15        for (int i = 0; i < nums.length; i++) {
16
17            if (nums[i] > 0) {
18                ans.add(i + 1);
19            }
20        }
21
22        return ans;
23    }
24}