// Last updated: 7/9/2026, 9:14:58 AM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++)
        {
            if(!st.empty()&&st.peek()==s.charAt(i))
            {
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty())
        {
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}