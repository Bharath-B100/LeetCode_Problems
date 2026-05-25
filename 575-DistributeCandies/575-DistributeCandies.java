// Last updated: 5/25/2026, 11:14:14 AM
import java.util.*;

class Solution {
    public int distributeCandies(int[] c) {
        Set<Integer> unique = new HashSet<>();
        for (int candy : c) {
            unique.add(candy);
        }
        return Math.min(unique.size(), c.length / 2);
    }
}
