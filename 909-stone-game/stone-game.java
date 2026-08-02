class Solution {
    public boolean stoneGame(int[] piles){
        Integer[][] dp = new Integer[piles.length][piles.length];
        return solve(piles, 0,piles.length - 1, dp) >= 0;
    }

    private int solve(int[] nums, int i, int j, Integer[][] dp) {
        if (i == j) {
            return nums[i];
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int left = nums[i] - solve(nums, i + 1, j, dp);
        int right = nums[j] - solve(nums, i, j - 1, dp);

        return dp[i][j] = Math.max(left, right);
    }
}