// Last updated: 8/22/2026, 6:03:10 PM
1class NumArray {
2    //test
3    int[] nums;
4
5    public NumArray(int[] nums) {
6        this.nums = nums;
7    }
8
9    public int sumRange(int left, int right) {
10        int sum = 0;
11
12        for (int i = left; i <= right; i++)
13            sum += nums[i];
14
15        return sum;
16    }
17}