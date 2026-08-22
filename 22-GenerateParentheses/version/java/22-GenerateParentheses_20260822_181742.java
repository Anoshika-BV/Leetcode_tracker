// Last updated: 8/22/2026, 6:17:42 PM
1public class Solution {
2    public List<String> generateParenthesis(int n) {
3        //test
4        List<String> res = new ArrayList<>();
5        String s="";
6        backtrack(0, 0, n, res, s);
7        return res;
8    }
9
10    private void backtrack(int open, int close, int n, List<String> res, String str) {
11        if (open == close && open == n) {
12            res.add(str);
13            return;
14        }
15
16        if (open < n) {
17            str+="(";
18            backtrack(open + 1, close, n, res, str);
19            str=str.substring(0,str.length()-1);
20        }
21        if (close < open) {
22            str+=")";
23            backtrack(open, close + 1, n, res, str);
24            str=str.substring(0,str.length()-1);
25        }
26    }
27}