// Last updated: 7/27/2026, 2:20:46 PM
1class Solution
2{
3
4public int[] intersect(int[] nums1, int[] nums2) {
5    //test
6	Arrays.sort(nums1);
7	Arrays.sort(nums2);
8	int top = 0;
9	int bottom = 0;
10	List<Integer> h = new ArrayList<>();
11
12	while (true){
13		if (top >= nums1.length || bottom >= nums2.length){
14			break;
15		}
16		if (nums1[top] == nums2[bottom]){
17			h.add(nums1[top]);
18			top ++;
19			bottom ++;
20		}
21		else if (nums1[top] < nums2[bottom]){
22			top ++;
23		}
24		else if (nums1[top] > nums2[bottom]){
25			bottom ++;
26		}
27	}
28
29	int[] g = new int[h.size()];
30	for (int i = 0; i < h.size(); i++) {
31		g[i] = h.get(i);
32	}
33	return g;
34}
35}