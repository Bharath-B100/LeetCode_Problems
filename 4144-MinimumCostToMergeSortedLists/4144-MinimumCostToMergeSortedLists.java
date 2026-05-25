// Last updated: 5/25/2026, 11:08:19 AM
class Solution {
    public long minMergeCost(int[][] lists) {
        int n = lists.length;
        int maxMask = 1 << n;

        int[] len = new int[maxMask];
        long[] median = new long[maxMask];
        long[] dp = new long[maxMask];
        Arrays.fill(dp, Long.MAX_VALUE);

        for (int mask = 1; mask < maxMask; mask++) {
            List<Integer> merged = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    for (int x : lists[i]) merged.add(x);
                }
            }
            Collections.sort(merged);
            len[mask] = merged.size();
            median[mask] = merged.get((len[mask] - 1) / 2); 
        }
        dp[0] = 0;
        for (int mask = 1; mask < maxMask; mask++) {
            if ((mask & (mask - 1)) == 0) {
                dp[mask] = 0;
                continue;
            }

            for (int sub = (mask - 1) & mask; sub > 0; sub = (sub - 1) & mask) {
                int other = mask ^ sub;
                if (other == 0) continue;

                long cost = dp[sub] + dp[other]
                        + len[sub] + len[other]
                        + Math.abs(median[sub] - median[other]);

                dp[mask] = Math.min(dp[mask], cost);
            }
        }

        return dp[maxMask - 1];
    }
}
