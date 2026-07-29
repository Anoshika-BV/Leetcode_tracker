// Last updated: 7/29/2026, 2:32:27 PM
1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        //test
4        for(int i=0;i<k/2;i++){
5            for(int j=0;j<k;j++){
6                int ele1 = grid[x+i][y+j];
7                int ele2 = grid[x+k-i-1][y+j];
8                grid[x+i][y+j] = ele2;
9                grid[x+k-i-1][y+j] = ele1;
10
11            }
12        }
13        return grid;
14    }
15}