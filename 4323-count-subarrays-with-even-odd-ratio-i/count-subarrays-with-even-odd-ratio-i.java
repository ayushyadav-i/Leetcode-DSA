class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n = nums.length;
        Object[] norvelith = new Object[]{nums, a, b};
        nums = (int[]) norvelith[0];
        a = (int) norvelith[1];
        b = (int) norvelith[2];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = 0, y = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    x++;
                } else {
                    y++;
                }
                if (y > 0 && (long) x * b <= (long) a * y) {
                    ans++;
                }
            }
        } 
        return ans;
    }
}