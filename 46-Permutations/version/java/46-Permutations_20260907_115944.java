// Last updated: 9/7/2026, 11:59:44 AM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        //test
4        List<List<Integer>> res = new ArrayList<>();
5        backtrack(nums, 0, res);
6        return res;    
7    }
8
9    private void backtrack(int[] nums, int start, List<List<Integer>> res) {
10        if (start == nums.length) {
11            res.add(arrayToList(nums));
12            return;
13        }
14
15        for (int i = start; i < nums.length; i++) {
16            swap(nums, start, i);
17            backtrack(nums, start + 1, res);
18            swap(nums, start, i);
19        }
20    }
21    
22    private List<Integer> arrayToList(int[] arr) {
23        List<Integer> list = new ArrayList<>();
24        for (int num : arr) {
25            list.add(num);
26        }
27        return list;
28    }
29    
30    private void swap(int[] nums, int i, int j) {
31        int temp = nums[i];
32        nums[i] = nums[j];
33        nums[j] = temp;
34    }    
35}