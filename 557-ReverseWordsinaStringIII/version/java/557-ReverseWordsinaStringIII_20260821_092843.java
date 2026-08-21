// Last updated: 8/21/2026, 9:28:43 AM
1class Solution {
2    public String reverseWords(String s) {
3        //test
4        String[] words = s.split(" ");
5
6        StringBuilder ans = new StringBuilder();
7
8        for (int i = 0; i < words.length; i++) {
9
10            String reversed =
11                    new StringBuilder(words[i]).reverse().toString();
12
13            ans.append(reversed);
14
15            if (i != words.length - 1) {
16                ans.append(" ");
17            }
18        }
19
20        return ans.toString();
21    }
22}