// Last updated: 6/3/2026, 11:45:22 PM
1class Solution {
2    public int[] decrypt(int[] code, int k) {
3        int N = code.length;
4        int[] res = new int[N];
5        for (int i = 0; i < N; i++) {
6            if (k > 0) {
7                for (int j = i + 1; j < i + 1 + k; j++) {
8                    res[i] += code[j % N];
9                }
10            } else if (k < 0) {
11                for (int j = i - 1; j > i - 1 - Math.abs(k); j--) {
12                    res[i] += code[((j % N) + N) % N];
13                }
14            }
15        }
16        return res;
17    }
18}