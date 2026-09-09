// Last updated: 9/9/2026, 10:15:42 AM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        //test
4        int count = 0;
5
6        for (int j = 0; j < strs[0].length(); j++) {
7            for (int i = 1; i < strs.length; i++) {
8                if (strs[i].charAt(j) < strs[i - 1].charAt(j)) {
9                    count++;
10                    break;
11                }
12            }
13        }
14
15        return count;
16    }
17}