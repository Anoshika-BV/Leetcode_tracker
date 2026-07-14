// Last updated: 7/14/2026, 9:47:45 AM
1class Solution {
2    public String addStrings(String num1, String num2) {
3        //test
4        int carry=0;
5        StringBuilder result = new StringBuilder();
6        int i=num1.length() -1;
7        int j=num2.length() -1;
8        while(i>=0 || j>=0)
9        {
10            int n1 = (i<0)?0:num1.charAt(i)-'0';
11            int n2 = (j<0)?0:num2.charAt(j)-'0';
12
13            int sum=n1+n2+carry;
14            result.append(sum%10);
15            carry=sum/10;
16
17            i--;
18            j--;
19        }
20        if(carry==1){
21            result.append(carry);
22        }
23        return result.reverse().toString();
24    }
25}