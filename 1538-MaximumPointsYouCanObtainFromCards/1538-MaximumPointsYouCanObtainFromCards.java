// Last updated: 5/25/2026, 11:12:15 AM
class Solution {
    public int maxScore(int[] arr, int k) {
        int sum =0;
        for(int i=0;i<k;i++){
            sum = sum + arr[i]; 
        }
        int max = sum;
        for (int i=0;i<k;i++){
            sum = sum +arr[arr.length-i-1]- arr[k-i-1];
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}