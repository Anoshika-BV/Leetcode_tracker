// Last updated: 7/16/2026, 11:45:46 AM
1class Solution {
2    public boolean validPalindrome(String s) {
3        //test
4        int left = 0;
5        int right = s.length() - 1;
6
7        while (left < right) {
8
9            if (s.charAt(left) != s.charAt(right)) {
10                return isPalindrome(s, left + 1, right) ||
11                       isPalindrome(s, left, right - 1);
12            }
13
14            left++;
15            right--;
16        }
17
18        return true;
19    }
20
21    private boolean isPalindrome(String s, int left, int right) {
22
23        while (left < right) {
24
25            if (s.charAt(left) != s.charAt(right))
26                return false;
27
28            left++;
29            right--;
30        }
31
32        return true;
33    }
34}