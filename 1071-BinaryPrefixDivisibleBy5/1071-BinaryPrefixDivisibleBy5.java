// Last updated: 5/25/2026, 11:13:11 AM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int val = 0;
        for(int ele : nums){
            val = ((val*2)+ele)%5;
            ans.add(val==0);
        }
        return  ans;
    }
}
