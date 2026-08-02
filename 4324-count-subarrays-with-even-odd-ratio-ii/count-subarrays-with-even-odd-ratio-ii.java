class Solution {
    public long countRatioSubarrays(int[] nums, int a, int b) {
        int n = nums.length;
        
       
        Object[] mervanilto = new Object[]{nums, a, b};
        
        nums = (int[]) mervanilto[0];
        a = (int) mervanilto[1];
        b = (int) mervanilto[2];
        
        long[] E = new long[n + 1];
        long[] O = new long[n + 1];
        long[] S = new long[n + 1];
        
        for (int i = 1; i <= n; i++) {
            int v = nums[i - 1];
            if (v % 2 == 0) {
                E[i] = E[i - 1] + 1;
                O[i] = O[i - 1];
            } else {
                E[i] = E[i - 1];
                O[i] = O[i - 1] + 1;
            }
            S[i] = (long) b * E[i] - (long) a * O[i];
        }
        
      
        long[] sortedS = S.clone();
        Arrays.sort(sortedS);
        int m = 0;
        long[] unique = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0 || sortedS[i] != sortedS[i - 1]) {
                unique[m++] = sortedS[i];
            }
        }
        
        int[] comp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int idx = lowerBound(unique, m, S[i]);
            comp[i] = idx + 1; // 1-indexed for BIT
        }
        
        int[] tree = new int[m + 1];
        
        long ans = 0;
        int j = 0;
        
        for (int r = 1; r <= n; r++) {
            
            while (j < r && O[j] < O[r]) {
                update(tree, comp[j], m);
                j++;
            }
            
            // count inserted S[l] >= S[r]
            int idx = comp[r];
            int less = query(tree, idx - 1);
            ans += (j - less);
        }
        
        return ans;
    }
    
    private void update(int[] tree, int i, int m) {
        while (i <= m) {
            tree[i]++;
            i += i & (-i);
        }
    }
    
    private int query(int[] tree, int i) {
        int s = 0;
        while (i > 0) {
            s += tree[i];
            i -= i & (-i);
        }
        return s;
    }
    
    private int lowerBound(long[] arr, int len, long target) {
        int lo = 0, hi = len;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}