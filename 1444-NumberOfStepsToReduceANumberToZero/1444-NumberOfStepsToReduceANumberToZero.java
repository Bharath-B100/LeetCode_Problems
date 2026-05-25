// Last updated: 5/25/2026, 11:12:29 AM
class Solution {
    public int numberOfSteps(int num)
    {
        int count =0;//2
        while(0<num)//6
        {
            if(num%2==0)
            {
                num = num/2;
                count++;
            }
            else if(num%2==1)
            {
                num = num - 1;
                count++;
            }
        }
        return count;
    }
}