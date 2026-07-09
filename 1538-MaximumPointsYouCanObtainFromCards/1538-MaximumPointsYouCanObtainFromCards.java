// Last updated: 7/9/2026, 9:14:48 AM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum =0;
        for(int i =0;i<k;i++)
        {
            sum =sum+cardPoints[i];
        }
        int max = sum;
        for(int i =0;i<k;i++)
        {
            sum =sum+cardPoints[cardPoints.length-i-1]-cardPoints[k-i-1];
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}