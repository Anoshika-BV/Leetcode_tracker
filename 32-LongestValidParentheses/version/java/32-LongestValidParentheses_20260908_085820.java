// Last updated: 9/8/2026, 8:58:20 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3        //test
4        Stack<Integer> st = new Stack<>();
5        st.push(-1);
6        int max = 0;
7
8        for (int i = 0; i < s.length(); i++) {
9            if (s.charAt(i) == '(')
10                st.push(i);
11            else {
12                st.pop();
13
14                if (st.empty())
15                    st.push(i);
16                else
17                    max = Math.max(max, i - st.peek());
18            }
19        }
20        return max;
21    }
22}