// Last updated: 7/28/2026, 2:37:11 PM
1class Solution {
2public int maxProduct(int n) {
3    //test
4        int first = 0;
5
6        int second = 0;
7
8        while (n > 0) {
9            int digit = n % 10;
10
11            if (digit >= first) {
12                second = first;
13                first = digit;
14            }
15            else if (digit > second) {
16                second = digit;
17            }
18
19            n /= 10;
20        }
21
22        return first * second;
23    }
24};