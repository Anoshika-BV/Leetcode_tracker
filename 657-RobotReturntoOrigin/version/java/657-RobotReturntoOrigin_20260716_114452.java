// Last updated: 7/16/2026, 11:44:52 AM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        //test
4        int x = 0;
5        int y = 0;
6
7        for (char ch : moves.toCharArray()) {
8
9            if (ch == 'U')
10                y++;
11            else if (ch == 'D')
12                y--;
13            else if (ch == 'L')
14                x--;
15            else
16                x++;
17        }
18
19        return x == 0 && y == 0;
20    }
21}