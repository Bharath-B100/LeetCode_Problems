// Last updated: 8/10/2026, 10:40:47 AM
1class Solution {
2    public String[] findWords(String[] words) {
3        ArrayList <String> list = new ArrayList<>(); 
4        String row1 = "qwertyuiop";
5        String row2 = "asdfghjkl";
6        String row3 = "zxcvbnm";
7        for(String i : words){
8            if(isinrow(i,row1) || isinrow(i,row2) || isinrow(i,row3)){
9                list.add(i);
10            }
11        }
12        return list.toArray(new String[0]);
13    }
14    private boolean isinrow(String s,String row){
15      for(char c:s.toCharArray()){
16        if(row.indexOf(Character.toLowerCase(c))==-1){
17            return false;
18        }
19      }
20      return true;
21    }
22}