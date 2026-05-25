// Last updated: 5/25/2026, 11:15:19 AM
public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h_index = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > h_index)
                h_index++;
            else
                break;
        }
        return h_index;
    }
}