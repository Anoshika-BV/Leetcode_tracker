// Last updated: 7/9/2026, 9:15:31 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        //test
        int tp = 0;
        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }
        return sp == s.length();        
    }
}