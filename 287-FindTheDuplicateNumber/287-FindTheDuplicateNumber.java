// Last updated: 5/25/2026, 11:15:16 AM
class Solution {
    public int findDuplicate(int[] a) {
        int s = a[0], f = a[0];
        do { s = a[s]; f = a[a[f]]; } while (s != f);
        s = a[0];
        while (s != f) { s = a[s]; f = a[f]; }
        return s;
    }
}
