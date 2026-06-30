// Last updated: 6/30/2026, 12:04:19 PM
1class Solution {
2    public int[][] merge(int[][] arr) {
3        Arrays.sort(arr,(a,b)->a[0]-b[0]);
4        List<int[]> l = new ArrayList<>();
5
6        int curr[] = arr[0];
7        for(int i=0;i<arr.length;i++){
8            if(curr[1]>=arr[i][0]){
9            curr[1] = Math.max(arr[i][1],curr[1]);
10            }
11            else{
12                l.add(curr);
13                curr=arr[i];
14            }
15        } 
16        l.add(curr);
17        return l.toArray(new int[l.size()][]);
18    }
19}