// Last updated: 5/25/2026, 11:10:33 AM
class Solution {
    public int minimumRecolors(String s, int k) {
        int min =0,count =0,n=s.length();
        char arr[]=s.toCharArray();
        for(int i =0;i<k;i++){
            if(arr[i]=='W'){
                count++;
            }
        }
        min=count;
        for(int i=1;i<n-k+1;i++)
        {
            if(arr[i-1]=='W'){
                count--;
            } 
            if(arr[i+k-1]=='W'){
                count++;
            }
            if(count<min){
                min = count;
            }
        }
        return min;
    }
}