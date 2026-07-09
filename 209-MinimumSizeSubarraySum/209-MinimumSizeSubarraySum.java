// Last updated: 7/9/2026, 9:15:57 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int si=0;int sum=0;
        int min=n;
        if(nums[si]>=target){
            min=1;
        }
        sum=nums[si];
        for(int li=1;li<n;li++){
            sum=sum+nums[li];
            while(sum>=target){
                if((li-si+1)<min){
                    min=li-si+1;
                }
                sum=sum-nums[si];
                si++;
            }
        }
        if(si==0 && sum<target)
            return 0;
        return min;
    }
}