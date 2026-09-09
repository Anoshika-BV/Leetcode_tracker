// Last updated: 9/9/2026, 10:14:53 AM
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        //test
4        int[] a = score.clone();
5        Arrays.sort(a);
6
7        String[] ans = new String[score.length];
8
9        for (int i = 0; i < score.length; i++) {
10            int rank = 1;
11
12            for (int j = a.length - 1; j >= 0; j--, rank++) {
13                if (score[i] == a[j]) {
14                    if (rank == 1) ans[i] = "Gold Medal";
15                    else if (rank == 2) ans[i] = "Silver Medal";
16                    else if (rank == 3) ans[i] = "Bronze Medal";
17                    else ans[i] = "" + rank;
18                    break;
19                }
20            }
21        }
22        return ans;
23    }
24}