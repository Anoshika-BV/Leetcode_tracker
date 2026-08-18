// Last updated: 8/18/2026, 2:39:35 PM
1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        //test
4        char[] even1 = {s1.charAt(0), s1.charAt(2)}, even2 = {s2.charAt(0), s2.charAt(2)};
5        char[] odd1 = {s1.charAt(1), s1.charAt(3)}, odd2 = {s2.charAt(1), s2.charAt(3)};
6
7         Arrays.sort(even1);
8         Arrays.sort(even2);
9
10         Arrays.sort(odd1);
11         Arrays.sort(odd2);
12
13        return Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2);
14    }
15}