// Last updated: 5/25/2026, 11:09:58 AM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int ans=0;
        if(mainTank<5)
            ans = mainTank*10;
        else{
            while(mainTank > 0)
            {
                if(mainTank >= 5)
                {
                    mainTank=(mainTank-5);
                    ans =ans +(5*10);
                    if(additionalTank>=1)
                    {
                        mainTank = mainTank + 1;
                        additionalTank = additionalTank - 1;
                    }
                }
                else
                {
                    ans = ans + mainTank*10;
                    mainTank = 0;
                }
            }
        }
        return ans;
    }
}