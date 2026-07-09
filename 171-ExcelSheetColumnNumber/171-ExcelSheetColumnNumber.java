// Last updated: 7/9/2026, 9:16:10 AM
public class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int length = columnTitle.length();

        for (int i = 0; i < length; i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1;  // A=1, B=2, ..., Z=26
            result = result * 26 + value;
        }

        return result;  // <-- fixed semicolon
    }  // <-- only normal spaces, no \u00A0
}
