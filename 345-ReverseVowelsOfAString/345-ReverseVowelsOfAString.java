// Last updated: 7/9/2026, 9:15:35 AM
class Solution {
    public String reverseVowels(String s) {
        // Convert string to char array so we can modify it
        char[] chars = s.toCharArray();
        // Vowels set (both lower and upper case)
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Move left pointer until it points to a vowel
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }
            // Move right pointer until it points to a vowel
            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }

            // Swap vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move both pointers inward
            left++;
            right--;
        }
        return new String(chars);
    }
}
