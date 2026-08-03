// Last updated: 8/3/2026, 10:14:58 AM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        //test
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        int[][] result = new int[n][m];
8
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                result[j][i] = matrix[i][j];
12            }
13        }
14
15        return result;
16    }
17}