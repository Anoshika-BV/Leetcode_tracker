// Last updated: 7/14/2026, 9:40:51 AM
1class Solution {
2    public int countSegments(String s) {
3        //test
4        String[] arr = s.split(" ");
5        int count = 0;
6        for (String i : arr)
7            if (i.length() != 0)
8                count++;
9        return count;
10    }
11}