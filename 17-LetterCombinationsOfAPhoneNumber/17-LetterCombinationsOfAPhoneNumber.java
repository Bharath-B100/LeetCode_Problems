// Last updated: 5/25/2026, 11:18:13 AM
class Solution {
        static HashMap<Character,String>  map;
        static List<String> res;
    public List<String> letterCombinations(String digits) {
        int n =digits.length();
        if(n==0) return res;
        map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        res = new ArrayList<>();
        backtrack(digits, new StringBuilder(),0);
        return res;
    }
    static void backtrack(String digit,StringBuilder path,int index){
        if(index == digit.length()){
            res.add(path.toString());
            return;
        }
        String x = map.get(digit.charAt(index));
        for(char ch:x.toCharArray()){
            path.append(ch);
            backtrack(digit,path,index+1);
            path.deleteCharAt(path.length()-1);
        }
    }
}