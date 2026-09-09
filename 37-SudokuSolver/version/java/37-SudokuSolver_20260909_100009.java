// Last updated: 9/9/2026, 10:00:09 AM
1class Solution {
2    public void solveSudoku(char[][] b) {
3        //test
4        solve(b);
5    }
6
7    boolean solve(char[][] b) {
8        for (int i = 0; i < 9; i++)
9            for (int j = 0; j < 9; j++)
10                if (b[i][j] == '.') {
11
12                    for (char n = '1'; n <= '9'; n++) {
13                        if (ok(b, i, j, n)) {
14                            b[i][j] = n;
15
16                            if (solve(b)) return true;
17
18                            b[i][j] = '.';
19                        }
20                    }
21                    return false;
22                }
23
24        return true;
25    }
26
27    boolean ok(char[][] b, int r, int c, char n) {
28        for (int i = 0; i < 9; i++) {
29
30            if (b[r][i] == n || b[i][c] == n)
31                return false;
32
33            int x = 3 * (r / 3) + i / 3;
34            int y = 3 * (c / 3) + i % 3;
35
36            if (b[x][y] == n)
37                return false;
38        }
39        return true;
40    }
41}