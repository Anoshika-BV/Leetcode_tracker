// Last updated: 7/9/2026, 9:14:44 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
       int res=0;
       for(int i=0;i<n;i++){
        res = res | nums[i];
       }
       return res<<(n-1);
    }
}