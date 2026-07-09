// Last updated: 7/9/2026, 9:14:55 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i], val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                list.add(val);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
