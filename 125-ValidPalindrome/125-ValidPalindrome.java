// Last updated: 7/9/2026, 9:16:26 AM
class Solution {
    public boolean isPalindrome(String s) {
        //test
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;        
    }
}