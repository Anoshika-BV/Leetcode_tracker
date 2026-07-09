// Last updated: 7/9/2026, 9:14:45 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        char[] ch = new char[n + m];
        int i = 0, j = 0, k = 0;
        while (j < n || k < m) {
            if (j < n) { 
                ch[i++] = word1.charAt(j++);
            }
            if (k < m) { 
                ch[i++] = word2.charAt(k++);
            }
        }
        return new String(ch);
    }
}
