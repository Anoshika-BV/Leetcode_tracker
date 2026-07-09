// Last updated: 7/9/2026, 9:15:45 AM
class Solution {
    public int addDigits(int num) {
        while (num >= 10) {   // repeat until single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // add last digit
                num /= 10;        // remove last digit
            }
            num = sum;  // replace number with digit sum
        }
        return num;
    }
}
