// Last updated: 7/9/2026, 9:14:54 AM
class Solution {
    public int dayOfYear(String date) {
        // Split date into parts
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // Days in each month
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Check leap year: divisible by 400 OR divisible by 4 but not 100
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            daysInMonth[1] = 29; // February = 29 days
        }

        // Count total days
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day;

        return totalDays;
    }
}
