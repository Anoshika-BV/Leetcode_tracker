// Last updated: 7/9/2026, 9:15:08 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //test
        int count = 0;
        for (char j : jewels.toCharArray()) {
            for (char s : stones.toCharArray()) {
                if (j == s) {
                    count++;
                }
            }
        }
        return count;
    }
}