// Last updated: 8/11/2026, 12:16:37 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3    //test
4        HashMap<Integer, Integer> map = new HashMap<>();
5        for (int n : nums) {
6            map.put(n, map.getOrDefault(n, 0) + 1);
7        }
8        ArrayList<Integer> list = new ArrayList<>(map.keySet());
9        list.sort((a, b) -> map.get(b) - map.get(a));
10
11        int[] ans = new int[k];
12
13        for (int i = 0; i < k; i++) {
14            ans[i] = list.get(i);
15        }
16
17        return ans;
18    }
19}