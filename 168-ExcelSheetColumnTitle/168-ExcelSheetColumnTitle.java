// Last updated: 7/9/2026, 9:16:13 AM
public class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";

        while (columnNumber > 0) {
            columnNumber--; // zero-based index adjustment
            int remainder = columnNumber % 26;
            char letter = (char) ('A' + remainder);
            result = letter + result; // prepend character
            columnNumber /= 26;
        }

        return result;
    }
}
