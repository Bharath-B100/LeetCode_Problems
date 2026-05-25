// Last updated: 5/25/2026, 11:13:47 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (char a : jewels.toCharArray()) {
            h.put(a, 1);
        }
        int count = 0;
        for (char a : stones.toCharArray()) {
            if (h.containsKey(a)) {
                count++;
            }
        } 
        return count;
    }
}
