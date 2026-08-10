// Last updated: 8/10/2026, 2:18:32 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3        int copy[] = new int[heights.length];
4        int arr[] = new int[heights.length];
5        for(int i=0;i<heights.length;i++){
6            copy[i]=heights[i];
7        }
8        Arrays.sort(copy);
9        for(int i=0;i<copy.length;i++){
10            arr[i]=copy[i];
11        }
12        int count=0;
13        for(int i=0;i<heights.length;i++){
14            if(arr[i]!=heights[i]){
15                count++;
16            }
17        }
18        return count;
19    }
20}