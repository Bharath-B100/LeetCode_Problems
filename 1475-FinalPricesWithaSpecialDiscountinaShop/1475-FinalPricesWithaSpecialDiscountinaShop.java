// Last updated: 8/28/2026, 11:18:15 AM
1class Solution {
2    public int[] finalPrices(int[] prices) {
3        Stack<Integer> st = new Stack<>();
4        int j=1;
5        for(int i=0;i<prices.length;i++){
6            j = i+1;
7            
8            while(j<prices.length && prices[i]<prices[j]){
9                j++;
10            }
11            if(j!=prices.length){
12            st.push(prices[i]-prices[j]);
13            }
14            else{
15            st.push(prices[i]);
16            }
17        }
18        int i =prices.length;
19        while(!st.isEmpty()){
20            prices[--i] = st.pop();
21        }
22        return prices;
23    }
24}