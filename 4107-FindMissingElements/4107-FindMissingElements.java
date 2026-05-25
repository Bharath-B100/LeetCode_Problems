// Last updated: 5/25/2026, 11:08:22 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = nums[0];
        int right = nums[n-1];
        
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for( int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i = left ; i<= right ; i++ ){
           if( !set.contains(i)){
            ans.add(i);
        }
        }
        return ans;
    }
}