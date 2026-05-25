// Last updated: 5/25/2026, 11:14:05 AM
class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum = 0,n=arr.length;
        for (int i = 0; i < k; i++) {
            sum =sum+arr[i];
        }
        int max = sum;
        for (int i = 1; i < n-k+1; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];  

            if (sum > max) {
                max = sum;
            }
        }
        return (double)max/k;
    }
}
