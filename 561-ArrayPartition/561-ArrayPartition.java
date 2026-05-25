// Last updated: 5/25/2026, 11:14:15 AM
import java.util.*;
class Solution {
    public int arrayPairSum(int[] n) {
        Arrays.sort(n);
        int min=0;
        for(int i=0;i<n.length;i+=2)
        {
            min = min+n[i];
        }
        return min;
    }
}