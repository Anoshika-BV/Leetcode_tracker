// Last updated: 7/9/2026, 9:15:38 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;   // must be positive

        while (n % 3 == 0) {        // keep dividing by 3
            n /= 3;
        }

        return n == 1;              // if reduced to 1 → power of 3
    }
}
