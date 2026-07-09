// Last updated: 7/9/2026, 9:16:17 AM
class Solution {
    public String reverseWords(String s) {
        String s1[] = s.split(" ");
        String ans = "";
        for(int i = s1.length - 1; i >= 0; i--) {
            if(!s1[i].equals("")) {
                ans += s1[i] + " ";
            }
        }
        return ans.trim();
    }
}