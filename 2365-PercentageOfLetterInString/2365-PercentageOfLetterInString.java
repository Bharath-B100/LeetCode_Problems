// Last updated: 5/25/2026, 11:10:40 AM
class Solution {
    public int percentageLetter(String s, char letter) {
        int len= s.length();
        int count=0,sum=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(letter==ch[i])
            {
                count++;
            }
        }
        if(count!=0)
        {
            sum = 100*count/len;
        }
        return sum;
    }
}