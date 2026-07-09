// Last updated: 7/9/2026, 9:14:47 AM
class Solution {
    public boolean isvowel(char c )
    {
        return c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int count =0,n=s.length();
        for(int i =0;i<k;i++){
            if(isvowel(s.charAt(i)))
            count++;
        }
        int max =count;
        for(int i=1;i<n-k+1;i++)
        {
            if(isvowel(s.charAt(i-1)))
            {
                count--;
            }
            if(isvowel(s.charAt(i+k-1)))
            {
                count++;
            }
            if(count>max){
                max =count;
            }
        }
        return max;
    }
}