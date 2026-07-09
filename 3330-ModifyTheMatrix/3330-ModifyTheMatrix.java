// Last updated: 7/9/2026, 9:14:32 AM
class Solution {
    public int[][] modifiedMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] colMax = new int[n];

        // find max of each column
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        // replace -1 with column max
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) {
                    grid[i][j] = colMax[j];
                }
            }
        }
        return grid;
    }
}
