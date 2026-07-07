class Solution {

    public int coinChange(int[] a, int k) {

        int[][] dp = new int[a.length][k + 1];

        for (int i = 0; i < a.length; i++)
            Arrays.fill(dp[i], -1);

        int ans = count(a, k, 0, dp, 0);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    int count(int[] a, int k, int idx, int[][] dp, int sum) {

        if (sum == k)
            return 0;

        if (idx == a.length)
            return Integer.MAX_VALUE;

        if (dp[idx][sum] != -1)
            return dp[idx][sum];

        int pick = Integer.MAX_VALUE;

        // Prevent integer overflow
        if ((long) sum + a[idx] <= k) {

            int temp = count(a, k, idx, dp, sum + a[idx]);

            if (temp != Integer.MAX_VALUE)
                pick = temp + 1;
        }

        int not = count(a, k, idx + 1, dp, sum);

        return dp[idx][sum] = Math.min(pick, not);
    }
}