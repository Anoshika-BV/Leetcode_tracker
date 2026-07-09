// Last updated: 7/9/2026, 9:15:18 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        //test
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}