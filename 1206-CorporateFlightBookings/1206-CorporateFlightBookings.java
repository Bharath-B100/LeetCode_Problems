// Last updated: 5/25/2026, 11:12:59 AM
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n];
        for (int[] booking : bookings)
        {
            int first = booking[0];
            int last = booking[1];
            int seats = booking[2];
            for(int i = first ;i<=last;i++){
                diff[i-1] += seats;  
            }
        }
        return diff;
    }
}