// Last updated: 7/9/2026, 9:16:04 AM
class Solution {
    // Function to calculate sum of squares of digits
    private int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;     // last digit
            sum += digit * digit;   // add its square
            n /= 10;                // remove digit
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;                // slow pointer
        int fast = getSquareSum(n);  // fast pointer starts one step ahead

        while (fast != 1 && slow != fast) {
            slow = getSquareSum(slow);                   // move 1 step
            fast = getSquareSum(getSquareSum(fast));     // move 2 steps
        }

        return fast == 1;
    }
}
