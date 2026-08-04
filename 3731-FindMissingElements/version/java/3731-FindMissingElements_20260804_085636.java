// Last updated: 8/4/2026, 8:56:36 AM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        int left = nums[0];
6        int right = nums[n-1];
7        
8        List<Integer> ans = new ArrayList<>();
9        Set<Integer> set = new HashSet<>();
10        for( int i=0;i<n;i++){
11            set.add(nums[i]);
12        }
13        for(int i = left ; i<= right ; i++ ){
14           if( !set.contains(i)){
15            ans.add(i);
16        }
17        }
18        return ans;
19    }
20}