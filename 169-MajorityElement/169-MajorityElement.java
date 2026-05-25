// Last updated: 5/25/2026, 11:16:13 AM
import java.util.*;
class Solution {
    public int majorityElement(int[] n) {
        int m = n[0];
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (count == 0) {
                m = n[i];
            }
            if (n[i] == m) {
                count++;
            } else {
                count--;
            }
        }
        return m;
    }
}