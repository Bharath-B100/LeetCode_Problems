// Last updated: 5/25/2026, 11:11:29 AM
class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int i = 1;
        while(Math.max(memory1, memory2) >= i){
            if(memory1 >= memory2)
                memory1 -= i;
            else
                memory2 -= i;
            i++;
        }
        return new int[]{i, memory1, memory2};
    }
}