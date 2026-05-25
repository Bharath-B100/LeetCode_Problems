// Last updated: 5/25/2026, 11:11:06 AM
class Solution {
    public int maxConsecutiveAnswers(String a, int k) {
        int max=0;
        int countT=0,countF=0;
        int len=0;
        int left=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='T'){
                countT++;
            }else{
                countF++;
            }
            while(Math.min(countT,countF)>k){
                if(a.charAt(left)=='T'){
                    countT--;
                }else{
                    countF--;
                }
                left++;
            }
            len=i-left+1;
            max=Math.max(max,len);
        }
        return max;
    }
}
