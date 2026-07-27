// Last updated: 7/27/2026, 9:57:15 AM
1class Solution {
2    public int findShortestSubArray(int[] nums) {
3        //test
4        int max=0;
5        HashMap<Integer,Integer> map = new HashMap<>();
6        ArrayList<Integer> list = new ArrayList<>();
7        for(int i: nums){
8            list.add(i);
9            map.put(i,map.getOrDefault(i,0)+1);
10            if((int)map.get(i)>max)
11                max=map.get(i);
12        }
13        int min = Integer.MAX_VALUE;
14        for(Map.Entry m: map.entrySet()){
15            if((int)m.getValue()==max){
16                int num = (int)m.getKey();
17                int n1 = list.indexOf(num);
18                int n2 = list.lastIndexOf(num);
19                if(n2-n1+1<min)
20                    min=n2-n1+1;
21            }
22        }
23        return min;
24    }
25}