// Last updated: 8/22/2026, 9:56:53 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int diff=-1;
4        int min =Integer.MAX_VALUE;
5        for(int i=0;i<drones.length;i++){
6           int sum = Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
7            if(sum<=drones[i][2]){
8                if(sum<min){
9                    min = sum;
10                    diff = i;
11                }
12            }
13        }
14        return diff;
15    }
16}