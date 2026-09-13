// Last updated: 9/13/2026, 9:52:25 PM
1class Solution {
2    public int maxIncreaseKeepingSkyline(int[][] grid) {
3        //test
4        int n = grid.length;
5        int[] row = new int[n];
6        int[] col = new int[n];
7
8        for (int i = 0; i < n; i++)
9            for (int j = 0; j < n; j++) {
10                row[i] = Math.max(row[i], grid[i][j]);
11                col[j] = Math.max(col[j], grid[i][j]);
12            }
13
14        int ans = 0;
15
16        for (int i = 0; i < n; i++)
17            for (int j = 0; j < n; j++)
18                ans += Math.min(row[i], col[j]) - grid[i][j];
19
20        return ans;
21    }
22}