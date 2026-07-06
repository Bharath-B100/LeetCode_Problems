// Last updated: 7/6/2026, 8:57:16 PM
1import java.math.BigInteger;
2class Solution {
3    public String multiply(String s1, String s2) {
4        BigInteger n1 = new BigInteger(s1);
5        BigInteger n2 = new BigInteger(s2);
6        
7        return n1.multiply(n2).toString();
8    }
9}