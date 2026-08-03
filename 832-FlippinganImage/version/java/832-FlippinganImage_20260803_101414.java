// Last updated: 8/3/2026, 10:14:14 AM
1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3    //test
4        for (int[] row : image) {
5            int left = 0, right = row.length - 1;
6
7            while (left <= right) {
8                int temp = row[left] ^ 1;
9                row[left] = row[right] ^ 1;
10                row[right] = temp;
11
12                left++;
13                right--;
14            }
15        }
16
17        return image;
18    }
19}