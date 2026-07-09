// Last updated: 7/9/2026, 9:14:41 AM
class Solution {
    public String largestGoodInteger(String num) {  
    for (int i = 9; i >= 0; i--) {
        String s = String.valueOf(i).repeat(3);
        if (num.contains(s)) return s;
    }
    return "";
}

    }