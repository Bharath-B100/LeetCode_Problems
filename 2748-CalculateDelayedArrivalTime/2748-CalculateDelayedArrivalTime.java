// Last updated: 5/25/2026, 11:10:08 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int trainTime = (arrivalTime + delayedTime) % 24;
        return trainTime;
        
    }
}