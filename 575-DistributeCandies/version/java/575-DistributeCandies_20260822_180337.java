// Last updated: 8/22/2026, 6:03:37 PM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        //test
4        Set<Integer> set= new HashSet<>();
5        for(int i:candyType){
6            set.add(i);
7        }
8        return Math.min(candyType.length/2,set.size());
9    }
10}