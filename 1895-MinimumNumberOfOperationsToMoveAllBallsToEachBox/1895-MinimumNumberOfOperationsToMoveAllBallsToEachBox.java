// Last updated: 5/25/2026, 11:11:38 AM
class Solution {
    public int[] minOperations(String b) {
        char arr[]=b.toCharArray();
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length; j++){
                if(arr[j]=='1'){
                    sum =sum+Math.abs(i-j);
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}