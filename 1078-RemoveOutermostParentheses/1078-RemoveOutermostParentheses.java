// Last updated: 7/9/2026, 9:14:59 AM
class Solution {
    public String removeOuterParentheses(String s) {
     Stack <Character> st = new Stack<>();
     StringBuilder res = new StringBuilder();
     int count=0;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            if(count != 0){
                res.append(s.charAt(i));
            }
            count++;
        }
        else{
            if(count != 1){
                res.append(s.charAt(i));
            }
            count--;
        }
     }   
     return res.toString();
    }
}