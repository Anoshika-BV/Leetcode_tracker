// Last updated: 7/9/2026, 9:15:23 AM
class Solution {
    public int[] constructRectangle(int area) {
        //test
        int i = (int) Math.sqrt(area);

        for(; i>=1; i--){
            if(area % i == 0){
                return new int [] {area/i, i};
            }
        }

        return new int []{area, 1};
        
    }
}