// Last updated: 8/22/2026, 6:18:09 PM
1class Solution {
2    public String countAndSay(int n) {//test
3     if(n==1)return "1";
4     String p=countAndSay(n-1);
5     int q=p.length();
6     StringBuilder sb=new StringBuilder();
7     int count=1;
8     for(int i=1;i<q;i++){
9        if(p.charAt(i) == p.charAt(i-1)){
10            count++;
11        }
12        else{
13            sb.append(count).append(p.charAt(i-1));
14            count=1;
15        }
16     }   
17     sb.append(count).append(p.charAt(q-1));
18     return sb.toString();
19    }
20}