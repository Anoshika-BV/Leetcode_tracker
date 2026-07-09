// Last updated: 7/9/2026, 9:16:09 AM
class Solution {
    public int trailingZeroes(int n) {
    //test
    int res = 0;
    while (n > 0) {
        n /= 5;
        res += n;
    }
    return res;
}}