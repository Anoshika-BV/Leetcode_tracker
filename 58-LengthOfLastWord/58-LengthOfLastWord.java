// Last updated: 7/9/2026, 9:16:45 AM
class Solution {
    //test
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String words[] = s.split(" ");
        return words[words.length - 1].length();  
} 
}