// Last updated: 7/9/2026, 9:15:43 AM
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;   // ugly numbers must be positive

        // Keep dividing by 2, 3, or 5 while possible
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        // If reduced to 1, it's ugly
        return n == 1;
    }
}
