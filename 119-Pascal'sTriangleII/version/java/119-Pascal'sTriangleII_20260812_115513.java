// Last updated: 8/12/2026, 11:55:13 AM
1public class Solution {
2    public List<Integer> getRow(int k) {
3        //test
4        Integer[] arr = new Integer[k + 1];
5        Arrays.fill(arr, 0);
6        arr[0] = 1;
7        
8        for (int i = 1; i <= k; i++) 
9            for (int j = i; j > 0; j--) 
10                arr[j] = arr[j] + arr[j - 1];
11        
12        return Arrays.asList(arr);
13    }
14}