// Last updated: 7/5/2026, 12:56:33 PM
1class Solution{
2    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
3        Arrays.sort(arr);
4        int n= arr.length;
5        arr[0]= 1;
6        for (int i=1;i<n;i++){
7            arr[i]= Math.min(arr[i], arr[i- 1]+1);
8        }
9        return arr[n-1];
10    }
11}
12