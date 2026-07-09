// Last updated: 7/9/2026, 9:15:06 AM
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int li=n-1;
        int fi=0,c=0;
        int mid;
        int count =0;
        while(fi<=li){
            mid=(li+fi)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                fi=mid+1;
            }
            else
            {
               li=mid-1;
            }
            
        }
        return -1;

    }
}