// Last updated: 9/9/2026, 10:08:33 AM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        //test
4        List<List<String>> ans = new ArrayList<>();
5        char[][] board = new char[n][n];
6
7        for (char[] row : board)
8            Arrays.fill(row, '.');
9
10        solve(0, board, ans);
11        return ans;
12    }
13
14    void solve(int row, char[][] board, List<List<String>> ans) {
15        if (row == board.length) {
16            List<String> list = new ArrayList<>();
17            for (char[] r : board)
18                list.add(new String(r));
19            ans.add(list);
20            return;
21        }
22
23        for (int col = 0; col < board.length; col++) {
24            if (safe(board, row, col)) {
25                board[row][col] = 'Q';
26                solve(row + 1, board, ans);
27                board[row][col] = '.';
28            }
29        }
30    }
31
32    boolean safe(char[][] b, int r, int c) {
33        for (int i = 0; i < r; i++)
34            if (b[i][c] == 'Q') return false;
35
36        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--)
37            if (b[i][j] == 'Q') return false;
38
39        for (int i = r - 1, j = c + 1; i >= 0 && j < b.length; i--, j++)
40            if (b[i][j] == 'Q') return false;
41
42        return true;
43    }
44}