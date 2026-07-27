// Last updated: 7/27/2026, 10:14:55 AM
1class Solution {
2    public int uniqueMorseRepresentations(String[] words) {
3    //test
4
5    String []arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
6
7    HashMap<String,Boolean>mp=new HashMap<>();
8
9    for(int i=0;i<words.length;i++){
10
11    String check="";
12
13    for(int j=0;j<words[i].length();j++){
14
15    check+=arr[words[i].charAt(j)-'a'];
16
17    }
18
19    mp.put(check,true);
20
21    }
22    return mp.size();
23        
24    }
25}