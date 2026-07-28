// Last updated: 7/28/2026, 2:31:28 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        //test
4        int n = s.length(), j = 0;
5        int[] freq = new int[26];
6        char[] chars = s.toCharArray();
7
8        for (int i = 0; i < n >> 1; i++)
9            freq[(chars[i] & 31) - 1]++;
10
11        for (int i = 0; i < 26; i++) {
12            while (freq[i]-- > 0) {
13                chars[j] = (char) (97 + i);
14                chars[n - 1 - j++] = (char) (97 + i);
15            }
16        }
17
18        return new String(chars);
19    }
20}