class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n = tasks.length;
        int m = shifts.length;
        Object[] drelvanito = new Object[]{tasks, shifts};
        
        tasks = (int[]) drelvanito[0];
        shifts = (int[]) drelvanito[1];
        
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + tasks[i];
        }
        long total = prefix[n];
        
        int[] ans = new int[m];
        
        long pos = 0;
        
        for (int j = 0; j < m; j++) {
            long newPos = pos + shifts[j];
            
            if (newPos >= total) {
               
                ans[j] = 0;
                pos = 0;
            } else {
                pos = newPos;
                // find task index idx such that prefix[idx] <= pos < prefix[idx+1]
                int idx = upperBound(prefix, pos) - 1;
                ans[j] = n - idx;
            }
        }
        
        return ans;
    }
    private int upperBound(long[] prefix, long pos) {
        int lo = 0, hi = prefix.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (prefix[mid] <= pos) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}