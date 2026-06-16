// Last updated: 6/16/2026, 10:58:38 PM
1import java.math.BigInteger;
2
3class Solution {
4    public String multiply(String s1, String s2) {
5        BigInteger n1 = new BigInteger(s1);
6        BigInteger n2 = new BigInteger(s2);
7        
8        return n1.multiply(n2).toString();
9    }
10}