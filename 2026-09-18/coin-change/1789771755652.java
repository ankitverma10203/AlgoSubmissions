int ans = memo[amount];
        return ans >= MAX ? -1 : ans;
    }
        }

            }
            memo[amountLeft] = minCoin;
}
    private static int MAX = 100_000;

    public int coinChange(int[] coins, int amount) {

        int[] memo = new int[amount + 1];
        memo[0] = 0;

        for (int amountLeft = 1; amountLeft <= amount; amountLeft++) {
            int minCoin = MAX;
            for (int coin : coins) {
                if (amountLeft < coin) continue;
                int numOfCoins = 1 + memo[amountLeft - coin];

                if (numOfCoins >= MAX) continue;

                minCoin = Math.min(minCoin, numOfCoins);

class Solution {