// Last updated: 5/25/2026, 11:12:52 AM
class Solution {
    public int wateringPlants(int[] plants, int capacity) 
    {
        int iValue = capacity;
        int iTotal = 0;

        for(int i = 0; i < plants.length; i++)
        {
            if(iValue < plants[i])
            {
                iTotal = iTotal + (i); 
                iValue = capacity - plants[i];
                iTotal = iTotal + (i+1);
            }
            else
            {
                iTotal++;
                iValue = iValue - plants[i];
            }
        }
        return iTotal;
    }
}