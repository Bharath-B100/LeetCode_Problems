// Last updated: 5/25/2026, 11:12:26 AM
class Solution {
    public int maximum69Number(int num) {
        return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));
    }
}