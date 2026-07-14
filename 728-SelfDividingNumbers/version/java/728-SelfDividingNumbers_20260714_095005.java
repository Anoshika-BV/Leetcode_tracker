// Last updated: 7/14/2026, 9:50:05 AM
1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        //test
4        List<Integer> result = new ArrayList<>();
5
6        while (left <= right) 
7        {
8            int num = left;
9            boolean isSelfDividingNumber = true;
10            while (num != 0) 
11            {
12                int digit = num % 10;
13                num /= 10;
14
15                if (digit == 0 || left % digit != 0) 
16                {
17                    isSelfDividingNumber = false;
18                    break;
19                }
20            }
21            if (isSelfDividingNumber)
22                result.add(left);
23
24            left++;
25        }
26
27        return result;
28    }
29}