// Last updated: 7/29/2026, 2:17:05 PM
1class Solution {
2    //test
3
4    private static final long LIMIT = 1_000_000L;
5
6    public String smallestPalindrome(String s, int k) {
7
8        int[] freq = new int[26];
9
10        for (char c : s.toCharArray()) {
11            freq[c - 'a']++;
12        }
13
14        String mid = "";
15
16        int[] half = new int[26];
17        int len = 0;
18
19        for (int i = 0; i < 26; i++) {
20            if ((freq[i] & 1) == 1) {
21                mid = String.valueOf((char) ('a' + i));
22            }
23            half[i] = freq[i] / 2;
24            len += half[i];
25        }
26
27        long total = countWays(half, len);
28
29        if (total < k) return "";
30
31        StringBuilder left = new StringBuilder();
32
33        while (len > 0) {
34
35            for (int c = 0; c < 26; c++) {
36
37                if (half[c] == 0) continue;
38
39                half[c]--;
40
41                long ways = countWays(half, len - 1);
42
43                if (ways >= k) {
44                    left.append((char) ('a' + c));
45                    len--;
46                    break;
47                } else {
48                    k -= ways;
49                    half[c]++;
50                }
51            }
52        }
53
54        StringBuilder ans = new StringBuilder();
55
56        ans.append(left);
57        ans.append(mid);
58        ans.append(new StringBuilder(left).reverse());
59
60        return ans.toString();
61    }
62
63    private long countWays(int[] half, int total) {
64
65        long res = 1;
66
67        int remaining = total;
68
69        for (int i = 0; i < 26; i++) {
70
71            int cnt = half[i];
72
73            if (cnt == 0) continue;
74
75            res *= nCrLimited(remaining, cnt);
76
77            if (res > LIMIT) return LIMIT;
78
79            remaining -= cnt;
80        }
81
82        return Math.min(res, LIMIT);
83    }
84
85    private long nCrLimited(int n, int r) {
86
87        if (r > n) return 0;
88
89        r = Math.min(r, n - r);
90
91        long ans = 1;
92
93        for (int i = 1; i <= r; i++) {
94
95            ans = ans * (n - r + i) / i;
96
97            if (ans > LIMIT) return LIMIT;
98        }
99
100        return ans;
101    }
102}