// Last updated: 8/18/2026, 1:52:33 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        //test
4        int row = matrix.length;
5        int col = matrix[0].length;
6        int[] dummyRow = new int[row];
7        int[] dummyCol = new int[col];
8        Arrays.fill(dummyRow, -1);
9        Arrays.fill(dummyCol, -1);
10        for(int i=0;i<row;i++){
11            for(int j=0;j<col;j++){
12                if(matrix[i][j]==0){
13                    dummyRow[i] = 0;
14                    dummyCol[j] = 0;
15                }
16            }
17        }
18        for(int i=0;i<row;i++){
19            for(int j=0;j<col;j++){
20                if(dummyRow[i] == 0 || dummyCol[j] == 0 ){
21                    matrix[i][j]=0;
22                }
23            }
24        }
25    }
26}