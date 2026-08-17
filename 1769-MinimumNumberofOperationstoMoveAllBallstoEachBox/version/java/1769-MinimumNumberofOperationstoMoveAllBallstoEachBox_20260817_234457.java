// Last updated: 8/17/2026, 11:44:57 PM
1class Solution {
2    public int[] minOperations(String b) {
3        char arr[]=b.toCharArray();
4        int ans[]=new int[arr.length];
5        for(int i=0;i<arr.length;i++){
6            int sum=0;
7            for(int j=0;j<arr.length; j++){
8                if(arr[j]=='1'){
9                    sum =sum+Math.abs(i-j);
10                }
11            }
12            ans[i]=sum;
13        }
14        return ans;
15    }
16}