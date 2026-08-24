// Last updated: 8/24/2026, 9:31:48 AM
1class Solution {
2    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
3
4        Map<Integer, Set<Integer>> mpp = new HashMap<>();
5        for (int[] r : reservedSeats) {
6            mpp.computeIfAbsent(r[0], k -> new HashSet<>()).add(r[1]);
7        }
8
9        int cnt = 0;
10        for (int i : mpp.keySet()) {
11            Set<Integer> reserved = mpp.get(i);
12            for (int s = 2; s <= 6; s += 2) {
13                if (!reserved.contains(s) && !reserved.contains(s + 1) && !reserved.contains(s + 2)
14                        && !reserved.contains(s + 3)) {
15                    cnt++;
16                    s += 2; 
17                }
18            }
19        }
20        cnt += (n - mpp.size()) * 2;
21        return cnt;
22    }
23}