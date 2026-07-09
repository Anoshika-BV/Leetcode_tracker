// Last updated: 7/9/2026, 9:14:42 AM
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int max =0,l,countT=0,countF=0,si=0;
        for(int li=0;li<answerKey.length();li++)
        {
            if(answerKey.charAt(li)=='T')
                countT++;
            else
                countF++;
            while(Math.min(countT,countF)>k)
            {
                if(answerKey.charAt(si)=='T')
                    countT--;
                else
                    countF--;
                si++;
            }
            l=li-si+1;
            if(l>max)
                max=l;
        }
        return max;
    }
}