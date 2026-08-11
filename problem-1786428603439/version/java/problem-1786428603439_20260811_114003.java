// Last updated: 8/11/2026, 11:40:03 AM
1class Solution {
2    public String[] sortPeople(String[] names, int[] heights) {
3        Map<Integer,String> sort = new TreeMap<>(Collections.reverseOrder());
4        for(int i=0;i<names.length;i++){
5            sort.put(heights[i],names[i]);
6        }
7        String arr[] = new String[heights.length];
8        int i=0;
9        for(String s:sort.values()){
10            arr[i++] =s;
11        }
12        return arr;
13    }
14} 