// Last updated: 5/25/2026, 11:14:44 AM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> obj = new ArrayList<>();

        for(int i = 1;i<=n;i++)
        {
            if(i % 3==0 && i % 5==0)
            {
                obj.add("FizzBuzz");
            }
            else if(i % 3==0 )
            {
                obj.add("Fizz");
            }
            else if(i % 5==0)
            {
                obj.add("Buzz");
            }
            else{
                obj.add(String.valueOf(i));
            }
        }
        return obj;
    }
}