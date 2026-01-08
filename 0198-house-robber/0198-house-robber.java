class Solution {
    public int rob(int[] nums) {
        int prev2 = 0; // dp[i-2]
        int prev1 = 0; // dp[i-1]

        for (int money : nums) {
            int curr = Math.max(prev1, prev2 + money);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
