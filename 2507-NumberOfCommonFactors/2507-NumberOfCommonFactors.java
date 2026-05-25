// Last updated: 5/25/2026, 11:10:25 AM
class Solution {
    public int commonFactors(int a, int b) 
    {
       int count=0;
       if(a<b)
        for(int i=1;i<=a ;i++)
        {
            if(a%i==0 && b%i==0)
                count++;
        }
        else
        {
        for(int i=1; i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }
        }return count; 
    }
        
}
