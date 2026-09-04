class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int diff=Integer.MAX_VALUE;
        int i=0;
        while(i<nums.length){
            int max=0;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                if(nums[j]>max){
                    max=nums[j];
                }
            }
            for(int l=i;l<nums.length;l++){
                if(nums[l]<min){
                    min=nums[l];
                }
            }
            diff=max-min;
            if(diff<=k){
                return i;
            }
            i++;

        }
        return -1;
        
    }
}