// Last updated: 5/25/2026, 11:15:26 AM
class Solution {
    public boolean isAnagram(String s, String t) {        
        boolean output = false;
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        for(char ch :t.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)-1);
            if(freq.get(ch)==0){
            freq.remove(ch);
            }
        }
        if(freq.isEmpty()){
            output = true;
        }
        return output;
    }
}