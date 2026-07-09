// Last updated: 7/9/2026, 9:15:05 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int si =1;
        int li=arr.length-1,mid;
        while(si<=li)
        {
            mid=(si+li)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid-1])
            {
                si=mid+1;
            }
            else
            {
                li=mid-1;
            }
        }
         return 0;
         }
}