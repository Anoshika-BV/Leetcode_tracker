// Last updated: 9/12/2026, 10:20:00 AM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        //test
4        for (int i = 0; i < flowerbed.length && n > 0; i++) {
5            if (flowerbed[i] == 0 &&
6                (i == 0 || flowerbed[i - 1] == 0) &&
7                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
8
9                flowerbed[i] = 1;
10                n--;
11            }
12        }
13
14        return n == 0;
15    }
16}