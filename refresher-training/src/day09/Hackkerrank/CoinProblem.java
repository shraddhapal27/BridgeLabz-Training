package day09.Hackkerrank;

import java.util.List;

public class CoinProblem {
    public static long getWays(int n, List<Long> c) {

        long[] dp = new long[n + 1];

        // One way to make amount 0:
        // choose no coins
        dp[0] = 1;

        for (long coin : c) {

            for (int amount = (int) coin; amount <= n; amount++) {

                dp[amount] += dp[amount - (int) coin];
            }
        }

        return dp[n];
    }
}
