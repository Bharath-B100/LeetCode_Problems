// Last updated: 5/25/2026, 11:13:33 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=1,high=arr.length-2;
        while (low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) //left la small value apro ri8 la small value
            {                                              //iruntha mid oda index ah return pannanum
                return mid;
            }
            else if(arr[mid]>arr[mid-1])
            {
                low = mid+1;
            }
            else if(arr[mid]>arr[mid+1])
            {
                high = mid-1;
            }
        }
        return 0;
    }
}