// Last updated: 7/27/2026, 10:09:50 AM
1class Solution {
2    public int countSetBits(int n){
3        //test
4        int count = 0;
5        while(n>0){
6            int rem = n%2;
7            count += rem;
8            n /= 2;
9        }
10        return count;
11    }
12    public boolean isPrime(int n){
13        if(n<=1) return false;
14        for(int i=2; i<=Math.sqrt(n); i++){
15            if(n%i == 0) return false;
16        }
17        return true;
18    }
19    public int countPrimeSetBits(int left, int right) {
20        int count = 0;
21        for(int i=left; i<=right; i++){
22            int num = countSetBits(i);
23            if(isPrime(num)) count++;
24        }
25        return count;
26    }
27}