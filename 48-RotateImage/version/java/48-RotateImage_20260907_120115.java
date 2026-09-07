// Last updated: 9/7/2026, 12:01:15 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        //test
4        int n = matrix.length;
5
6        for (int i = 0; i < n; i++) {
7            for (int j = i + 1; j < n; j++) {
8                int temp = matrix[i][j];
9                matrix[i][j] = matrix[j][i];
10                matrix[j][i] = temp;
11            }
12        }
13
14        for (int i = 0; i < n; i++) {
15            int l = 0, r = n - 1;
16            while (l < r) {
17                int temp = matrix[i][l];
18                matrix[i][l] = matrix[i][r];
19                matrix[i][r] = temp;
20                l++;
21                r--;
22            }
23        }
24    }
25}