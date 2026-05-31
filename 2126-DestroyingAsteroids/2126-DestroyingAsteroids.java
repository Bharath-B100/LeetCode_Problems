// Last updated: 5/31/2026, 6:46:24 PM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        Arrays.sort(asteroids);
4        long currentMass = mass;
5        for (int asteroid : asteroids) {
6            if (currentMass < asteroid) {
7                return false;
8            }
9            currentMass += asteroid;
10        }
11        return true;
12    }
13}