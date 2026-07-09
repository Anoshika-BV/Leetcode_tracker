// Last updated: 7/9/2026, 9:15:32 AM
//Java Code
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //test
        int[] letters = new int[26];
        for(char c : magazine.toCharArray())
            letters[c - 'a']++;
        for(char ch : ransomNote.toCharArray()){
            letters[ch - 'a']--;
            if(letters[ch - 'a'] == -1)
                return false;
        }
        return true;
    }
}