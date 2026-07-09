// Last updated: 7/9/2026, 9:15:02 AM
class Solution {
    public int[] sortArray(int[] nums) {
        quick(nums, 0, nums.length - 1);
        return nums;
    }

    static void quick(int[] nums, int low, int high) {
        if (low >= high) return;
        int i = low;
        int j = high;
        int mid = (i + j) / 2;
        int pivot = nums[mid]; 
        while (i <= j) {
            while (nums[i] < pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        quick(nums, low, j);
        quick(nums, i, high);
    }
}