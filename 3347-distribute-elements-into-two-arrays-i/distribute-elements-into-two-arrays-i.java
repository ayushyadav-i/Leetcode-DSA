class Solution {
    public int[] resultArray(int[] nums) {
        int[] a1 = new int[nums.length];
        int[] a2 = new int[nums.length];
        int k = 0, j = 0;
        a1[k++] = nums[0];
        a2[j++] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (a1[k - 1] > a2[j - 1]) {
                a1[k++] = nums[i];
            } else {
                a2[j++] = nums[i];
            }
        }
        int[] sol = new int[nums.length];
        int index = 0;
        for (int i = 0; i < k; i++) {
            sol[index++] = a1[i];
        }
        for (int i = 0; i < j; i++) {
            sol[index++] = a2[i];
        }
        return sol;
    }
}