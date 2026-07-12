// Last updated: 7/12/2026, 10:45:08 PM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        int start = toSeconds(startTime);
4        int end = toSeconds(endTime);
5        return end-start;
6    }
7        private int toSeconds(String Time){
8            String[] parts = Time.split(":");
9            int h = Integer.parseInt(parts[0]);
10            int m = Integer.parseInt(parts[1]);
11            int s = Integer.parseInt(parts[2]);
12            return h*3600+m*60+s; 
13    }
14}