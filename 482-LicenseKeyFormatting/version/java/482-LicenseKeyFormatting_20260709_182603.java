// Last updated: 7/9/2026, 6:26:03 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        //test
4        int n = s.length();
5
6        int cnt = 0; //counts the number of non dash character of s
7        String temp = ""; //a temporary string with non dash characters
8
9        for(int i=0;i<n;i++){
10            if(s.charAt(i)!='-'){
11                cnt++;
12                temp+=s.charAt(i);
13            }
14        }
15
16        int first_dash = cnt%k; //where the first dash has to be kept
17
18        String str = ""; //answer string
19        
20        int c = 0; //count to put dash when this value becomes equal to k
21
22        for(int i=0;i<cnt;i++){
23            if(i!=0 && (i==first_dash || c==k)){
24                str+='-';
25                str+=temp.charAt(i);
26                c=0;
27            }
28            else str = str + temp.charAt(i);
29            c++;
30        }
31        
32        return str.toUpperCase();
33    }
34}