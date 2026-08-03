class Solution {
    Integer[] memo;

    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        memo = new Integer[n];
        int diff = dfs(0, stoneValue);
        if (diff > 0) return "Alice";
        if (diff < 0) return "Bob";
        return "Tie";
    }
    private int dfs(int i, int[] stoneValue) {
        if (i >= stoneValue.length)
            return 0;
        if (memo[i] != null)
            return memo[i];
        int sum = 0;
        int best = Integer.MIN_VALUE;
        for (int k = 0; k < 3 && i + k < stoneValue.length; k++) {
            sum += stoneValue[i + k];
            best = Math.max(best, sum - dfs(i + k + 1, stoneValue));
        }
        return memo[i] = best;
    }
}