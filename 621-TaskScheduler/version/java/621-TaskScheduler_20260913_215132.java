// Last updated: 9/13/2026, 9:51:32 PM
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        //test
4        int[] count = new int[26];
5
6        for (char c : tasks)
7            count[c - 'A']++;
8
9        Arrays.sort(count);
10
11        int max = count[25];
12        int ans = (max - 1) * (n + 1);
13
14        for (int i = 25; i >= 0 && count[i] == max; i--)
15            ans++;
16
17        return Math.max(ans, tasks.length);
18    }
19}