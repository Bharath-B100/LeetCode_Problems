// Last updated: 5/25/2026, 11:10:04 AM
class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!st.isEmpty() && ((st.peek() == 'A' && s.charAt(i)=='B')||(st.peek()=='C' && s.charAt(i)=='D'))) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}