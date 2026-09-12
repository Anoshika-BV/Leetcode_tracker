// Last updated: 9/12/2026, 10:23:04 AM
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int five = 0, ten = 0;
4
5        for (int b : bills) {
6            if (b == 5) {
7                five++;
8            } 
9            else if (b == 10) {
10                if (five == 0) return false;
11                five--;
12                ten++;
13            } 
14            else {
15                if (ten > 0 && five > 0) {
16                    ten--;
17                    five--;
18                } 
19                else if (five >= 3) {
20                    five -= 3;
21                } 
22                else {
23                    return false;
24                }
25            }
26        }
27
28        return true;
29    }
30}