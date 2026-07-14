// Last updated: 7/14/2026, 9:43:37 AM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        //test
4        int perimeter = 0;
5        int rows = grid.length;
6        int cols = grid[0].length;
7        
8        for (int r = 0; r < rows; r++) {
9            for (int c = 0; c < cols; c++) {
10                if (grid[r][c] == 1) {
11                    perimeter += 4;
12                    if (r > 0 && grid[r-1][c] == 1) {
13                        perimeter -= 2;
14                    }
15                    if (c > 0 && grid[r][c-1] == 1) {
16                        perimeter -= 2;
17                    }
18                }
19            }
20        }
21        
22        return perimeter;
23    }
24}