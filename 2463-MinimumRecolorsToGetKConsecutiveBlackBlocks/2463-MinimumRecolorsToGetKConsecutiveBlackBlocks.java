// Last updated: 7/9/2026, 9:14:38 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min =k,count=0,n=blocks.length();
        for(int i =0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            {
                count++;
            }
        }
        min = count;
        for(int i =1;i<n-k+1;i++)
        {
            if(blocks.charAt(i-1)=='W')
                count--;
            if(blocks.charAt(i+k-1)=='W')
                count++;
            if(count<min)
                min = count ;
        }
        return min;
    }
}